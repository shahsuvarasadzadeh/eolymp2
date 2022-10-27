package arraysPart1;

import java.util.Scanner;

public class CutIndeksler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] d= new int[sc.nextInt()];
        for (int i=0;i<d.length;i++){
            d[i]= sc.nextInt();
            if (i%2==0) {
                System.out.print(d[i]+" ");
            }
        }

    }
}
