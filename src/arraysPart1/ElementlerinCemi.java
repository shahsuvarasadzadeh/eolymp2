package arraysPart1;

import java.util.Scanner;

public class ElementlerinCemi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double [] d= new double[sc.nextInt()];
        double sum=0;
        for (int i=0;i<d.length;i++){
            d[i]= sc.nextDouble();
            sum=sum+d[i];
        }
        System.out.println(sum);
    }
}
