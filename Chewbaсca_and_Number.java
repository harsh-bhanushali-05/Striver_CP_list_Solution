import java.util.*;

public class Chewbaсca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if the digit is less than 5 leave else 9- curr digit
        String n = sc.next();
        String ans = "";
        for (int i = 0; i < n.length(); i++) {
            int curr = (int) n.charAt(i) - '0';
            if (i == 0 && curr == 9) {
                ans += curr;
            } else if (curr < 5) {
                ans += curr;
            } else {
                ans += (9 - curr);
            }
        }
        System.out.println(ans);
    }
}
