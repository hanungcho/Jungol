package Q596;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
// 사용자값 입력 
      String str = sc.next();
      int inp = sc.nextInt();
// 조건과 반복 몇번할지 입력
      if (str.length() > inp) {
         for (int i = str.length() - 1; i >= str.length() - inp; i--) {
            System.out.print(str.charAt(i));
         }
      } else {
         for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
         }
      }

      sc.close();
   }

}