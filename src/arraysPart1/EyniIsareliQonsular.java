package arraysPart1;

import java.util.Scanner;

public class EyniIsareliQonsular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] d= new int[sc.nextInt()];
        for (int i=0;i<d.length;i++){
            d[i]= sc.nextInt();
        }

        for (int i=1;i<d.length;i++){
            if ((d[i]>0&&d[i-1]>0)||(d[i]<0&&d[i-1]<0)){
                System.out.print(d[i-1]+" "+d[i]);
                System.out.println();
            }
        }

    }
}
