package q506;

import java.util.Scanner;

public class Q126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;

		while (true) {

			int num = sc.nextInt();

			if (num == 0)
				break;

			else if ((num % 2) == 0)
				even++;
			else
				odd++;
		}

			System.err.println("odd : " + odd);
			System.err.println("even : " + even);

		}

	}


