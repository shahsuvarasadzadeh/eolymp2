package Ededler;

import java.util.Scanner;

public class m8894 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if((a%2==0&&a>=0)||(a%2!=0&&a<0)){
            System.out.println("NO");}
        else {
            System.out.println("YES");}

    }
}
