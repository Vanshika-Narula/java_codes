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

public class convertArr {
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

    public static int lengthLL(Node head) {
        if(head==null)
            return 0;
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static Node insertAtHead(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null)
            return newNode;
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        Node head = convertArr2LL(arr);
        printLL(head);
        System.out.println();
        int length = lengthLL(head);
        System.out.println(length);
        System.out.println();
    }
    
}
