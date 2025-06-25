public class Q10_set_matrix_zero {
    
    private static void set_Zeros(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean firstColZero = false;

        for(int i=0; i<n; i++){
            if(matrix[i][0]==0){
                firstColZero=true;
            }

            for(int j=1; j<m; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j]=0;
                }
            }
        }


        if(matrix[0][0]==0){
            for(int j=0; j<m; j++){
                matrix[0][j]=0;
            }
        }

        if(firstColZero){
            for(int i=0; i<n; i++){
                matrix[i][0]=0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
        set_Zeros(matrix);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    
}
