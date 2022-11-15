package q506;

import java.util.Scanner;

public class Q559 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] a = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int q = sc.nextInt();
		int w = sc.nextInt();
		sc.close();

		double sum = (a[q - 1] + a[w - 1]);

		System.out.printf("%.1f", sum);

	}

}
