package q506;

import java.util.Scanner;

public class q529 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hegiht = sc.nextInt();
		int wegiht = sc.nextInt();

		int sum = wegiht + 100 - hegiht;
		System.out.println(sum);

		if (sum > 0)
			;
		{
			System.out.println("obesity");
		}
		sc.close();

	}

}
