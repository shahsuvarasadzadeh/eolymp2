import java.util.Scanner;

public class M8878 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        while (n>0){
            if (n%10==0){
                count++;
            }
            n=n/10;
        }
        if (count!=0){
            System.out.println(count);
        }
        else {
            System.out.println("No");
        }
        //???

    }
}
