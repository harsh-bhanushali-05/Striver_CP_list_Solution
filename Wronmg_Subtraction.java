import java.util.*;

public class Wronmg_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while (k-- > 0) {
            if (n % 10 == 0) {
                n /= 10;
                continue;
            }
            n--;
        }
        System.out.println(n);
    }
}
