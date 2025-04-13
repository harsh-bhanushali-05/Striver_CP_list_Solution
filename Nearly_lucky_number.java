import java.util.*;

public class Nearly_lucky_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        // now find the number of lucky digits in this and weather that itself is a
        // lucky number
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '4' || n.charAt(i) == '7') {
                count++;
            }
        }
        boolean flag = true;
        if (count == 0) {
            System.out.println("NO");
            return;
        }
        while (count > 0) {
            if (count % 10 != 4 && count % 10 != 7) {
                flag = false;
                break;
            }
            count /= 10;
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
