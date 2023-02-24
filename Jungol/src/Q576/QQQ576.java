package Q576;

import java.util.Scanner;

class Math {
   private int x;
   private char op;
   private int y;

   public Math(int x, char op, int y) {
      this.x = x;
      this.op = op;
      this.y = y;
   }

   public void calculate() {
      int result = 0;
      if (op == '+') {
         result = x + y;
      } else if (op == '-') {
         result = x - y;
      } else if (op == '*') {
         result = x * y;
      } else if (op == '/') {
         result = x / y;
      }
      System.out.printf("%d %s %d = %d", x, op, y, result);
   }
}

public class QQQ576 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();
      char op = sc.next().charAt(0);
      int y = sc.nextInt();
      Math math = new Math(x, op, y);
      math.calculate();

      sc.close();

   }

}