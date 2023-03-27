import java.util.HashMap;
import java.util.Scanner;

public class RumEdedleri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int sum1 = 0;
        int sum2 = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("M", 1000);
        hashMap.put("D", 500);
        hashMap.put("C", 100);
        hashMap.put("L", 50);
        hashMap.put("X", 10);
        hashMap.put("V", 5);
        hashMap.put("I", 1);
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "I");
        hashMap1.put(2, "II");
        hashMap1.put(3, "III");
        hashMap1.put(4, "IV");
        hashMap1.put(6, "VI");
        hashMap1.put(7, "VII");
        hashMap1.put(8, "VIII");
        hashMap1.put(9, "IX");
        hashMap1.put(1000, "M");
        hashMap1.put(500, "D");
        hashMap1.put(100, "C");
        hashMap1.put(50, "L");
        hashMap1.put(10, "X");
        hashMap1.put(5, "V");
        hashMap1.put(1, "I");
        String key1 = String.valueOf(a.charAt(a.length() - 1));
        sum1 = sum1 + hashMap.get(key1);
        for (int i = a.length() - 1; i > 0; i--) {
            String key = String.valueOf(a.charAt(i - 1));
            key1 = String.valueOf(a.charAt(i));
            if (hashMap.get(key1) <= hashMap.get(key)) {
                sum1 = sum1 + hashMap.get(key);
            } else {
                sum1 = sum1 - hashMap.get(key);
            }
        }
        String key2 = String.valueOf(b.charAt(b.length() - 1));
        sum2 = sum2 + hashMap.get(key2);
        for (int i = b.length() - 1; i > 0; i--) {
            String key = String.valueOf(b.charAt(i - 1));
            key1 = String.valueOf(b.charAt(i));
            if (hashMap.get(key1) <= hashMap.get(key)) {
                sum2 = sum2 + hashMap.get(key);
            } else {
                sum1 = sum1 - hashMap.get(key);
            }
        }
        int sum = sum1 + sum2;
        System.out.println(sum1 + sum2);

    }
}
