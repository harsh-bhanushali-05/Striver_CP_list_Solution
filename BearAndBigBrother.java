import java.util.*;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        double lblog = Math.log((double) l / (double) b);
        double vallog = Math.log(2.0 / 3.0);
        double ans = (lblog / vallog);
        ans = Math.ceil(ans);
        if (l * Math.pow(3, ans) <= b * Math.pow(2, ans)) {
            ans = ans + 1;
        }
        System.out.println((int) ans);
    }
}