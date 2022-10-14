package Ededler;

import java.util.Scanner;

public class M8896 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
            if (((a%10)==(a/100))||((a%10)==((a/10)%10))||((a/100)==((a/10)%10))){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }

    }
}
