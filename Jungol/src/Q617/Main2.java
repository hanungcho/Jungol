package Q617;

import java.util.Scanner;

class ShortMan {
   List[] l;
   Scanner sc = new Scanner(System.in);

   ShortMan() {
      l = new List[5];

      for (int i = 0; i < l.length; i++) {
         String name = sc.next();
         int height = sc.nextInt();
         l[i] = new List(name, height);
//         System.out.println(l[i].getName() + " " + l[i].getHeight());
      }
   }

   void findShortest() {
      List shortMan = new List("", 0);
      int min = 300;
      for (int i = 0; i < l.length; i++) {
         if (min > l[i].getHeight()) {
            min = l[i].getHeight();
            shortMan = l[i];
         }
      }
      System.out.println(shortMan.getName() + " " + shortMan.getHeight());
   }
}

class List {
   private String name;
   private int height;

   List(String name, int height) {
      this.name = name;
      this.height = height;
   }

   public String getName() {
      return name;
   }

   public int getHeight() {
      return height;
   }
}

public class Main2 {
   public static void main(String[] args) {
      ShortMan sm = new ShortMan();
      sm.findShortest();
   }
}