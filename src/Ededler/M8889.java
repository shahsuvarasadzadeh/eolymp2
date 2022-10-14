package Ededler;

import java.util.Scanner;

public class M8889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int sum=0;
        while (n > 0) {
            if ((n % 10) % 2 == 0) {

            } else {
                n = n / 10;
            }
        }
        System.out.println(sum);
    }
}
