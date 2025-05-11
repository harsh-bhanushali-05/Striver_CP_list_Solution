import java.util.*;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); // this is the number that answers the call
            int ans = (10 * (n % 10 - 1));
            int count = 1;
            while (n > 0) {
                n /= 10;
                ans += count;
                count++;
            }
            System.out.println(ans); // this is the answer
        }
    }
}
