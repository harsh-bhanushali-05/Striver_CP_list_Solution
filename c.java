import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int ans = 0;
            while (true) {
                if (a > n || b > n) {
                    break;
                }
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }
                ans++;
            }
            System.out.println(ans);
        }
    }
}
