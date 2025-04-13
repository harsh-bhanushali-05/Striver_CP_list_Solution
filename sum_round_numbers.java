import java.util.*;

public class sum_round_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int mul = 1;
            List<Integer> arr = new ArrayList<>();
            while (n > 0) {
                int digit = n % 10;
                n /= 10;
                if (digit != 0) {
                    arr.add(digit * mul);
                }
                mul *= 10;
            }
            System.out.println(arr.size());
            for (int i = arr.size() - 1; i >= 0; i--) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
    }
}
