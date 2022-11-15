package q506;

import java.util.Scanner;

public class Q593 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("ASCII code =?");
			int a = sc.nextInt();

			if (a < 33 && a > 127) {

				// System.out.println((char) a);
			} else if (a == 0) {
				break;
			}
			System.out.println((char) a);

			// System.out.println((char)a);

		}
	}

}
