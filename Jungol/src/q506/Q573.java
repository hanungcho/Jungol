package q506;

import java.util.Scanner;

public class Q573 {

	public static int x(int num) {

		return num * num;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= x(num); i++) {
			System.out.print(i + " ");
			if ((i % num) == 0) {

				System.out.println();
			}
		}
	}
}
