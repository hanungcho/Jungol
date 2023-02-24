package q506;

import java.util.Scanner;

public class Q558 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int[100];

		for (int i = 0; i <= a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] == 0)
				break;

		}
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != 0)
				System.out.print(a[i] + " ");
			sc.close();
		}

	}
}

