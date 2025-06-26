public class Q12_move_zeroes_to_end {

    public static void move_zeroes(int[] arr){
        int pos = 0;
        for(int i : arr){
            if(i!=0){
                arr[pos++] = i;
            }
        }

        while(pos<arr.length){
            arr[pos++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1 ,0 ,3 ,12};
        move_zeroes(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
