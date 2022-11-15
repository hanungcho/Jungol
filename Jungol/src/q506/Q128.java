package q506;

import java.util.Scanner;

public class Q128 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int con = 0;

		while (true) {
			int a = sc.nextInt();

			if (a == 0)
				break;
			if (a % 3 != 0 && a % 5 != 0)
				con++;
		}
		System.out.println(con);

	}

}
