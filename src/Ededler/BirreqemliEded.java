package Ededler;

import java.util.Scanner;

public class BirreqemliEded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (-10 < n && n < 10) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
