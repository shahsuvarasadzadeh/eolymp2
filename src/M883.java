import java.util.Scanner;

public class M883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        if(a==b && c==d || a==c && b==d || a==d && b==c) {
            System.out.println(a + b + c + d);
        }
        else {
            System.out.println("No");
        }
    }
}
