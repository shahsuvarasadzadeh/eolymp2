import java.util.Scanner;

public class NReqEdedSay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i < n; i++) {
            count = count * 10;
        }
        System.out.println(count * 10 - count);
    }
}
