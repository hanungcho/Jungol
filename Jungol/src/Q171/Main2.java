package Q171;

import java.util.Scanner;
class Main3 {
   int nN;
   int sum;

   public int Natural() {
      Scanner sc = new Scanner(System.in);
      nN = sc.nextInt();
      sc.close();

      int natural[] = new int[nN];
      if (nN > 1 && nN <= 1000) {
         for (int i = 0; i < natural.length; i++) {
            natural[i] = i + 1;
         }

         sum = 0;
         for (int i = 0; i < natural.length; i++) {
            sum += natural[i];
         }
      }
      return sum;
   }

   public class Main2 {
   public static void main(String[] args) {
      Main3 gauss = new Main3();

      int result = gauss.Natural();
      System.out.println(result);
   }
   }
}
