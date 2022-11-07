package q506;

import java.util.Scanner;

public class Q538 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("number?");
			int a = sc.nextInt();
			if (a > 0) {
				System.out.println("posirive integer");
			} else if (a < 0) {
				System.out.println("negarive number");
			} else
				break;
		}
		sc.close();

	}
}
		
			

//		for (;;)// true도 무한루프 가능
//		{
//			System.out.println("number?");
//			int inp = sc.nextInt();
//
//			if (inp > 0) {
//				System.out.println("positive integer");
//			} else if (inp < 0) {
//				System.out.println("negative number");
//			} else {
//				sc.close();
//				break;

			


