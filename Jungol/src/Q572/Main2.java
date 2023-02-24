package Q572;

import java.util.Scanner;

public class Main2 {

   double avg(double r) {
      return r * r * 3.14;
      
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int inp = sc.nextInt();
      sc.close();

      Main2 mm = new Main2();
      System.out.printf("%.2f", mm.avg(inp));
   }

}