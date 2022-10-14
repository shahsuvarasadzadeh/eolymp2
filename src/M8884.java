import java.util.Scanner;

public class M8884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (a==b&&a==c){
            System.out.println("equilateral");
        }
        else if ((a!=b&&a!=c&&c!=b)&&((a+b>c)&&(a+c>b)&&((b+c)>a))){
            System.out.println("versatile");
        }
        else if((a+b<=c)||(a+c<=b)||((b+c)<=a)){
            System.out.println("invalid");
        }
        else {
            System.out.println("isosceles");
        }
    }
}
