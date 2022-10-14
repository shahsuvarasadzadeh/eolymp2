package Ededler;

import java.util.Scanner;

public class TamKvadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int a = (int) Math.sqrt(n);
        if (a == Math.sqrt(n)) {
            System.out.println(a);
        } else {
            System.out.println("No");
        }
    }
}