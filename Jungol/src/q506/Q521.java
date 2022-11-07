package q506;

import java.util.Scanner;

public class Q521 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int c = a++;
		int d = --b;

		System.out.printf("%d %d %d", a, b, c * d);

	}

}
