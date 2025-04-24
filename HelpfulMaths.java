import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int arr[] = new int[s.length() / 2 + 1];
        for (int i = 0; i < s.length(); i += 2) {
            arr[i / 2] = Integer.parseInt(Character.toString((s.charAt(i))));
        }
        Arrays.sort(arr);
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
            if (i != arr.length - 1) {
                ans += "+";
            }
        }
        System.out.println(ans);
    }
}
