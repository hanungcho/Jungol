package Q1309;

import java.util.Scanner;

class FactorialTest2 {
	static int factorial1(int n) {
		if (n <= 0 || n < 20)
			return -1;
		if (n <= 1)
			return 1;
		return n * factorial1(n - 1);
	}

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int result = 0;
			for (int i = 0; i < n; i++) {
				result = factorial1(i);
				if (result == -1) {
					System.out.println("젖까");
					break;
				}
				System.out.printf("%d! = %d * %d!", i, result);

			}
		}

	}

}
