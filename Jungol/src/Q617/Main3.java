package Q617;

import java.util.Scanner;

class Info {
   private String name;
   private int height;

   public Info(String name, int height) {
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

class FindOut {
   public void Which() {
      Scanner sc = new Scanner(System.in);
      Info people[] = new Info[5];

      for (int i = 0; i < people.length; i++) {
         String name = sc.next();
         int height = sc.nextInt();
         people[i] = new Info(name, height);
      }
      sc.close();

      int min = people[0].getHeight();
      int position = 0;
      for (int i = 0; i < people.length; i++) {
         if (people[i].getHeight() < min) {
            min = people[i].getHeight();
         }

         if (people[i].getHeight() == min) {
            position = i;
         }
      }
      System.out.printf("%s %d", people[position].getName(), people[position].getHeight());
   }
}

public class Main3 {
   public static void main(String[] args) {
      FindOut who = new FindOut();

      who.Which();
   }
}