package Ededler;

import java.util.Scanner;

public class Bagban_M10_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double nn = n;
        double su = 0;
        int suDone = 0;
        su = 0.0;
        while (su <= 0.5) {
            su += 1 / nn;
            suDone++;
            nn--;
        }
        suDone -= 1;
        System.out.println((int)(n-suDone));
    }

}
