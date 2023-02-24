package Q173;

import java.util.Scanner;

public class Main {
   
    public int x(int inp1, int inp2){
    	
      
      int result = 0;
      if(inp1>inp2) {
      result = (inp1*inp1)-(inp2*inp2);
      
      }
      else if(inp2>inp1) {
      result = (inp2*inp2)-(inp1*inp1);
      
      }
      return result;
      
      
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Main a = new Main();
      
      int inp1 = sc.nextInt();
      int inp2 = sc.nextInt();
      sc.close();
      
      System.out.println(a.x(inp1,inp2));
      

   }

}