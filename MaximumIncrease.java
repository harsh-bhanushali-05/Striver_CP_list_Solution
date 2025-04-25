import java.util.*;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = -1;
        int ans = 0;
        int max = -1;
        while (n-- > 0) {
            int curr = sc.nextInt();
            if (curr > prev) {
                ans++;
                max = Math.max(max, ans);
                prev = curr;
            } else {
                ans = 1;
                prev = curr;
            }
        }
        System.out.println(max);
    }
}
