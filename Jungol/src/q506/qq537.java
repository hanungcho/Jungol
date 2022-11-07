package q506;

import java.util.Scanner;

public class qq537 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();

		int inp = sc.nextInt();
		int sum = 0, j = 1;
		while (j <= inp) {
			sum += j++;
		}
		System.out.println(sum);

	}

}
