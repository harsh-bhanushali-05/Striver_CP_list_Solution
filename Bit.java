import java.util.*;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while (n-- > 0) {
            String s = sc.next();
            if (s.equals("++X") || s.equals("X++")) {
                x++;
            } else if (s.equals("--X") || s.equals("X--")) {
                x--;
            }
        }
        System.out.println(x);
    }
}