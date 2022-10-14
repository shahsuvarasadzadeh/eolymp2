package Ededler;

import java.util.Scanner;

public class M8889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int sum = 0;
        while (n > 0) {
            a = n % 10;
            if (a % 2 == 0) {
                a++;
            }
            sum = sum * 10 + a;
            n = n / 10;
        }
        n=0;
        while (sum > 0) {
            a = sum% 10;
            n = n * 10 + a;
            sum = sum / 10;
        }


        System.out.println(n);
    }
}
