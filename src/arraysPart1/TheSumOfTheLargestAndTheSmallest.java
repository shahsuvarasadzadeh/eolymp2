package arraysPart1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TheSumOfTheLargestAndTheSmallest {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();

            List<Integer> s = new ArrayList<Integer>();
            for (int i=0;i<n;i++){
                s.add(sc.nextInt());}
            Collections.sort(s);
            System.out.println(s.get(0)+s.get(n-1));
        }
    }