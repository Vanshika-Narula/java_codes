public class Q28_fruits_into_baskets2 {
    public static void main(String[] args) {
        int[] fruits = { 4, 2, 5 };
        int[] baskets = { 3, 5, 4 };

        int n = fruits.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (fruits[i] <= baskets[j]) {
                    ans++;
                    baskets[j] = -1;
                    break;
                }
            }
        }

        System.out.println(n-ans);
    }
}
