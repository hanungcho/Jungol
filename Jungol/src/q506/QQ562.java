package q506;

import java.util.Scanner;

public class QQ562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}
		sc.close();

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");

		}
		int sum1 = 0;
		for (int i = 0; i < ar.length; i += 2) {
			sum1 += ar[i];
		}
		int sum2 = 0;
		for (int i = 1; i < ar.length; i += 2) {
			sum2 += ar[i];
		}
		System.out.println("sum :" + sum2);
		System.out.printf("avg : %.1f", (double) sum1 / 5);
	}

}

