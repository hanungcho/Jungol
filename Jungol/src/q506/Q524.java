package q506;

import java.util.Scanner;

public class Q524 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		System.out.println(a + " " + b);

		if (a != 0 && b != 0) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
		System.out.println(" ");
		if (a != 0 || b != 0) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}

	}

}
