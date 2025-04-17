import java.util.*;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            int left = sc.nextInt();
            int enter = sc.nextInt();
            curr += enter;
            curr -= left;
            ans = Math.max(ans, curr);
        }
        System.out.println(ans);
    }
}