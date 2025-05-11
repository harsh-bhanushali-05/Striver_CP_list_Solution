import java.util.*;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        do {
            int curr_level = (ans + 1) * (ans + 2) / 2;
            if (curr_level <= n) {
                ans++;
                n -= curr_level;
            } else {
                break;
            }
        } while (n > 0);
        System.out.println(ans);
    }
}
