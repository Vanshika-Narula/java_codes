public class Q9_rotate_mat_90 {

    public static void rotate(int[][] matrix){
        int n = matrix.length;

        // transpose
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse rows
        for(int i=0; i<n; i++) {
            int l=0;
            int r=n-1;
            while(l<r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;r--;
            }
        }

    }

    public static void print(int[][] matrx){
        for(int i=0; i<matrx.length; i++){
            for(int j=0; j<matrx.length; j++){
                System.out.print(matrx[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        print(matrix);
    }
}
