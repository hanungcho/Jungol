package q506;

import java.util.Scanner;

public class Q539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sum = 0;
		double avg = 0;

		while (true) {
			int i = sc.nextInt();
			sum += i;
			num++;

			if (100 <= i)
				break;

		}
		avg = (double) sum / num;
		System.out.println(sum);
		System.out.printf("%.1f", avg);
	}

}

