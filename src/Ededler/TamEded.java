package Ededler;

import java.util.Scanner;

public class TamEded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int a=(int) n;
        if (a==n) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
