package arraysPart1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SumWithoutMaximum {
    public static void main(String[] args) {
        int s=0;
       Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for (int i=1;i<n;i++){
           if (a[i]>=a[i-1]){

           }
           else {
               s=a[i];
               a[i]= a[i-1];
               a[i-1]=s;
           }
        }

        for (int i=0;i<n-1;i++){
            if (a[i]!=a[n-1]){
                s=s+a[i];
            }

            }
        System.out.println(s);


    }
}
