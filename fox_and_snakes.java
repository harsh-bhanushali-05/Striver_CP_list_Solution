import java.util.*;

public class fox_and_snakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // if the row number is a odd then print the snake in all the columns
            if (i % 2 != 0) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            // if the row number is a even then print alternate (even and divisible by 4
            // then on the left else on the right)
            else {
                for (int j = 1; j <= m; j++) {
                    if (j == 1 && i % 4 == 0) {
                        System.out.print("#");
                    } else if (j == m && i % 4 != 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }
    }
}