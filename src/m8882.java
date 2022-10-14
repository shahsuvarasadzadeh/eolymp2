import java.util.Scanner;

public class m8882 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a= sc.nextLong();
        long b= sc.nextLong();
        long c= sc.nextLong();
        long d= sc.nextLong();

        if (a==b&&c==d&&a==c){
            System.out.println(a*a);
        }
        else {
            System.out.println("No");
        }
    }
}
