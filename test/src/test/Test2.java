package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int sum = num * num2;
		int avg = num / num2;
		System.out.printf("%d * %d = %d%n", num, num2, sum);
		System.out.printf("%d / %d = %d", num, num2, avg);

	}

}
