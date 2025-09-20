import java.util.*;
public class Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.toUpperCase().charAt(0) + s.substring(1).toLowerCase());
        sc.close();
    }
}