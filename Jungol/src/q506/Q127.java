package q506;

import java.util.Scanner;

public class Q127 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		int co = 0;

		while (true) {
			int num = sc.nextInt();
			if (num >= 0 && num <= 100) {
				sum += num;
				co++;
			} else
				break;

		}
		avg = (double)sum / co;
		System.out.println("sum : " +sum);
		System.out.printf("avg : %.1f", avg);

	}
}

