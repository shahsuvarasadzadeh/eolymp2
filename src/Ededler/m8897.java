package Ededler;

import java.util.Scanner;

public class m8897 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a= sc.nextLong();
        if (a>=0) {
            System.out.println(a + (10 - (a % 10)));
        }
        else {
            System.out.println(a-(a % 10));
        }
    }
}
