package Q1430;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close(); 
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
         
        int[] count = new int[10];
         
         
        String mul = String.valueOf(a * b * c);
         
        for(int i = 0; i < mul.length(); i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(mul.charAt(i) == numbers[j]) {
                    count[j]++;
                }
            }
        }
         
        for(int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
         
    }
}