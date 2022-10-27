package arraysPart1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MaxOfAbsoluteValues {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double [] d=new double[sc.nextInt()];
        for (int i=0;i<d.length;i++){
            d[i]= sc.nextDouble();
            if (d[i]<0){
                d[i]=Math.abs(d[i]);
            }
        }
        for (int i=0;i<d.length-1;i++){
            if (d[i]<=d[i+1]){
            }
            else {
                d[i+1]=d[i];
            }
        }
        System.out.println(df.format(d[d.length-1]));
    }
}
