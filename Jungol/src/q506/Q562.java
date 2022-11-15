package q506;

import java.util.Scanner;

public class Q562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int sum1 = 0;
		double sum2 = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (i % 2 == 0)
				sum2 += a[i];
			else
				sum1 += a[i];
		}
		System.out.println("sum : " + sum1);
		System.out.printf("avg : %.1f", sum2 / 5);

	}
}
