package Q616;

import java.util.Scanner;

class Point {
   private int x;
   private int y;
   
   public Point(int x,int y){
      this.x=x;
      this.y=y;
   }
   
   public int getX() {
      return x;
   }
   public int getY() {
      return y;
   }
}

class Tri{
   Point[] ar=new Point[3];
   private int i=0;
   private int sumX=0;
   private int sumY=0;
   
   public void triangle(Point p) {
      if(i>=ar.length) {
         return;
      }
      ar[i++]=p;
   }
   
   public void printCentroid() {
      for(int i=0;i<ar.length;i++) {
         sumX+=ar[i].getX();
         sumY+=ar[i].getY();
      }
      System.out.printf("(%.1f, %.1f)",sumX/(double)ar.length,sumY/(double)ar.length);
   }
}

public class Main3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Tri t1=new Tri();
      
      for(int i=0;i<t1.ar.length;i++) {
         int x=sc.nextInt();
         int y=sc.nextInt();
         t1.triangle(new Point(x,y));
      }
      sc.close();
      
      t1.printCentroid();
      
   }
}