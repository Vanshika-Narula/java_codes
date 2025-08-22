public class Q66_min_area_of_1s {
    // leetcode 3195

    public static int min_area(int[][] grid) {
        int minRow = grid.length;
        int minCol = grid[0].length;
        int maxRow = -1;
        int maxCol = -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(i, minRow);
                    minCol = Math.min(minCol, j);
                    maxRow = Math.max(maxCol, i);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        int area = (maxCol - minCol + 1) * (maxRow - minRow + 1);
        return area;
    }

    public static void main(String[] args) {
        int[][] grid = { { 0, 1, 0 }, { 1, 0, 1 } };
        int ans = min_area(grid);
        System.out.println(ans);

        
    }
}
