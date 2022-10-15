package Ededler;

import java.util.Scanner;

public class Bagban_M10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n= sc.nextDouble();
        double day=0;
        double c=n;
        double z=n;
        do {
            n=n-(1/c);
            day++;
            c--;
        }while (n>0&&c>0);
        n=z;
        c=0;
        while ((1/n)<(0.5)){
            c++;
            n--;
        }
            System.out.println((int) (day-c));
    }

}
