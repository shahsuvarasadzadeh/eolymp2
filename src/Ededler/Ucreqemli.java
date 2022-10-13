package Ededler;

import java.util.Scanner;

public class Ucreqemli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if ((-99 > n && n > -1000 )|| (n < 1000  && n > 99)) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
