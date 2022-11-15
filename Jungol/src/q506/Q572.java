package q506;

import java.util.Scanner;

public class Q572 {

	public static double avg(int num) {
		return num * num * 3.14;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.printf("%.2f", avg(num));
		sc.close();

	}
}
