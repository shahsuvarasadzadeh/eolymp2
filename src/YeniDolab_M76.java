import java.util.Scanner;

public class YeniDolab_M76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();

        if (((x<a&&y<b)||(x<b&&y<a))||((x<a&&z<b)||(x<b&&z<a))||((y<a&&z<b)||(y<b&&z<a))){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
