package Ededler;

import java.util.Scanner;

public class Ikireqemli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if ((-9 > n && n > -100 )|| (n < 100  && n > 9)) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
