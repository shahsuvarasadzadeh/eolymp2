import java.util.Scanner;

public class SethinSahesiVeHecm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if (a <= 1000000 && b <= 1000000 && c <= 1000000) {
            System.out.println((2 * ((a * b) + (b * c) + (a * c))) + " " + (a * b * c));
        }
    }
}
