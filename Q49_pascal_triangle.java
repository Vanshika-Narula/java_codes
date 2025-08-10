import java.util.*;

public class Q49_pascal_triangle {
    //                1
    //               1 1
    //              1 2 1
    //             1 3 3 1
    //            1 4 6 4 1

    public static List<List<Integer>> pascal_triangle(int n) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));

            for (int j = 1; j < i; j++) {
                int val = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
                row.set(j, val);
            }

            pascal.add(row);
        }
        return pascal;
        
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> al = pascal_triangle(n);
        System.out.println(al);
    }
}
