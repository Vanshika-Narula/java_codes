public class Q73_rotate_img {
    // leetcode 48

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        // transpose (rows to cols transformation)
        // 1 2 3               1 4 7
        // 4 5 6     ======>   2 5 8  
        // 7 8 9               3 6 9
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse left cols to right cols
        // 1 4 7              7 4 1
        // 2 5 8      ====>   8 5 2
        // 3 6 9              9 6 3

        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;
            while (l < r) {
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
