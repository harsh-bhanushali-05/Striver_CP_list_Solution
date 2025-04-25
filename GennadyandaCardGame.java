import java.util.*;

public class GennadyandaCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String table = sc.next();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            String curr = sc.next();
            if (curr.charAt(0) == table.charAt(0) || curr.charAt(1) == table.charAt(1)) {
                flag = true;

            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
