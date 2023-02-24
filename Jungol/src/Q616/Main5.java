package Q616;

import java.util.Scanner;

class Triangle {
   int[][] trianArr = new int[3][2];

   void scan() {
      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < trianArr.length; i++) {
         for (int j = 0; j < trianArr[i].length; j++) {
            int num = sc.nextInt();
            trianArr[i][j] = num;
         }
      }
      sc.close();
   }
}

class Calculator extends Triangle {
   double sumx = 0.0;
   double sumy = 0.0;

   void trian() {
      for (int i = 0; i < trianArr.length; i++) {
         for (int j = 0; j < trianArr[i].length; j++) {
            if (j == 0) {
               sumx += trianArr[i][j];
            } else {
               sumy += +trianArr[i][j];
            }
         }
      }
      System.out.printf("(%.1f, %.1f)", (sumx / 3), (sumy / 3));
   }
}

public class Main5 {
   public static void main(String[] args) {
      Calculator cal = new Calculator();
      cal.scan();
      cal.trian();
   }
}