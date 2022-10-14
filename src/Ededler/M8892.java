package Ededler;

import java.util.Scanner;

public class M8892 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if((a%3==0&&(a%2==0&&((a>9&&a<100)||(a>-100&&a<-9))))){
            System.out.println("YES");}
        else {
            System.out.println("NO");}
    }
}
