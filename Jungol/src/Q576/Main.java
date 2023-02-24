package Q576;

import java.util.Scanner;

public class Main {
	public static int fx(int a, String b, int c) {
		if (b.equals("+")) {
			return a + c;
		} else if (b.equals("-")) {
			return a - c;
		} else if (b.equals("*")) {
			return a * c;
		} else if (b.equals("/")) {
			return a / c;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		sc.close();

		int d = Main.fx(a, b, c); 

		System.out.printf("%d %s %d = %d", a, b, c,d);

	}

}
