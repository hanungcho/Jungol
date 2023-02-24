package test;

public class SS {

	public static void main(String[] args) {
		for(int a=2; a<10; a=a+3)  
        {
            for(int b=1; b<=9; b++)
            {
                for(int c=a; c<=a+2 && c<=9; c++)
                {
                    System.out.print(c + "x" + b + "=" + c * b + "\t");
                 }
                System.out.println();
            }
            System.out.println();
        }
    }


	}


