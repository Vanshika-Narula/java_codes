package linked_list;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class linkedlistDay2 {
    public static Node head;

    public static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static Node insertAtHead(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    public static Node insertAtTail(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node insertAtPos(Node head, int val, int k) {
        if (head == null) {
            if (k == 1)
                return new Node(val);
            else
                return null;
        }
        if (k == 1) {
            return new Node(val);
        }
        Node newNode = new Node(val);
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k - 1) {
                Node x = new Node(val, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        Node head = convertArr2LL(arr);
        printLL(head);
        System.out.println();
        head = insertAtHead(head, 0);
        printLL(head);
        System.out.println();
        head = insertAtTail(head, 14);
        printLL(head);
        System.out.println();
        head = insertAtPos(head, 11, 5);
        printLL(head);

    }
}
