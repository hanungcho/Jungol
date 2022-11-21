package q506;

import java.util.Scanner;

public class Q120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a < b) {
			System.out.println(b - a);
		} else if (a > b) {
			System.out.println(a - b);

		}
		
		System.out.println(Math.abs(a-b));

	}

}
