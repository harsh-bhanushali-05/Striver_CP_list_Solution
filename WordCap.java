import java.util.*;

public class WordCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
        System.out.println(s);
    }
}
