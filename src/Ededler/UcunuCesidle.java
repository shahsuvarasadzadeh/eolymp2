package Ededler;

import java.util.Arrays;
import java.util.Scanner;

public class UcunuCesidle {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int[] num = {sc.nextInt(), sc.nextInt(), sc.nextInt() };
            Arrays.sort(num);
            for(int i = 0; i<num.length; i++)
                System.out.print(num[i] + " ");
        }
    }
