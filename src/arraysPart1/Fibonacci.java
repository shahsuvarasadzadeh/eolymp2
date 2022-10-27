package arraysPart1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 2];
        a[0] = 1;
        a[1] = 1;
        if (n>1) {
            for (int i = 2; i <= n; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
            System.out.println(a[n]);
        }
        else {
            System.out.println(a[1]);
        }
    }
}
