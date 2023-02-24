package Q197;

import java.util.Scanner;

class Rect {
   private int x1, y1, x2, y2;

   public Rect(int x1, int y1, int x2, int y2) {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
   }

   public void print() {
      System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
   }

   public int getX1() {
      return x1;
   }

   public int getX2() {
      return x2;
   }

   public int getY1() {
      return y1;
   }

   public int getY2() {
      return y2;
   }
}

public class Main {
   public static void getWeight1(Rect[] inp) {
      int mx1 = Math.min(inp[0].getX1(), inp[1].getX1());
      int my1 = Math.min(inp[0].getY1(), inp[1].getY1());
      int mx2 = Math.max(inp[0].getX2(), inp[1].getX2());
      int my2 = Math.max(inp[0].getY2(), inp[1].getY2());
      
      System.out.print(mx1 + " ");
      System.out.print(my1 + " ");
      System.out.print(mx2 + " ");
      System.out.print(my2);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Rect[] inp = new Rect[2];
      for (int i = 0; i < inp.length; i++) {
         int x1 = sc.nextInt();
         int y1 = sc.nextInt();
         int x2 = sc.nextInt();
         int y2 = sc.nextInt();

         inp[i] = new Rect(x1, y1, x2, y2);
      }
      sc.close();

//      for (int i = 0; i < inp.length; i++) {
//         inp[i].print();
//      }

      getWeight1(inp);
   }
}