package q506;

import java.util.Scanner;

public class Q540 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			if (a % 3 == 0) {

				System.out.println(a / 3);
			} else if (a == -1) {
				break;

			}
		}
	}

}