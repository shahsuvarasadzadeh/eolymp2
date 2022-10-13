package Ededler;

import java.util.Scanner;

public class TamKvadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a=(int) Math.pow(n,2);
        if (a==Math.pow(n,2)) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
