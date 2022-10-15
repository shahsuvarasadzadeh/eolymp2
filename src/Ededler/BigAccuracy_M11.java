package Ededler;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BigAccuracy_M11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

//        double d = ((a/b)/Math.pow(10, c-1));
//
//        double d = Double.parseDouble(input);
//
//        System.out.println(String.format(
//                Locale.FRANCE, "%,.2f", ""));
//    }

        double x=a/b;
        DecimalFormat df = new DecimalFormat("#.###");
        String dx=df.format(x);
        x=Double.valueOf(dx);
        System.out.println(x);
    }
}
