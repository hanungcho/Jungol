package Q616;

import java.util.Scanner;

class CenterOfGravity {
   Scanner sc = new Scanner(System.in);
   private Triangle[] tri;

   public CenterOfGravity() {
      tri = new Triangle[3];
      for (int i = 0; i < tri.length; i++) {
         int x = sc.nextInt();
         int y = sc.nextInt();
         tri[i] = new Triangle(x, y);
      }
   }

   // 1단계 출력해보기
   public void print() {
      for (int i = 0; i < tri.length; i++) {
         System.out.println(tri[i].getX() + " " + tri[i].getY());
      }
   }

   public double getXcog() {
      int sum = 0;
      for (int i = 0; i < tri.length; i++) {
         sum += tri[i].getX();
      }
      return (double) sum / tri.length;
   }

   public double getYcog() {
      int sum = 0;
      for (int i = 0; i < tri.length; i++) {
         sum += tri[i].getY();
      }
      return (double) sum / tri.length;
   }

   public void printCog() {
      System.out.printf("(%.1f, %.1f)", getXcog(), getYcog());
   }
}

class Triangle {
   private int x;
   private int y;

   public Triangle(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public int getX() {
      return x;
   }

   public int getY() {
      return y;
   }
}

public class Main2 {

   public static void main(String[] args) {
      CenterOfGravity cog = new CenterOfGravity();
      cog.print();
//      System.out.println(cog.getXcog());
//      System.out.println(cog.getYcog());
      cog.printCog();
   }

}