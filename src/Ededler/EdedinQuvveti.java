package Ededler;

import java.util.Scanner;

public class EdedinQuvveti {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int sum = 1;
        for (int i = 0; i < 10; i++) {
            sum = sum * n;
        }
        System.out.println(sum);

    }
}
