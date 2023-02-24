package Q127;

import java.util.Scanner;

public class Main {
   int Num[] = new int[100];
   int count;

   void loop() {
      Scanner sc = new Scanner(System.in);
      for (int i = 0;;) {
         int num;
         num = sc.nextInt();
         if (num >= 0 && num <= 100) {
            Num[i++] = num;
            count++;
         }
         
         if (num < 0 || num > 100) {
            sc.close();
            break;
         }
      }
      need();
   }
   
   void need() {
      int sum = 0;
      for (int i = 0; i < Num.length; i++) {
         sum += Num[i];
      }
      System.out.printf("sum : %d\n", sum);
      
      float avg = (float) sum / (float) count;
      System.out.printf("avg : %.1f", avg);      
   }
   
   public static void main(String[] args) {
      Main feed = new Main();
      
      feed.loop();
   }
}