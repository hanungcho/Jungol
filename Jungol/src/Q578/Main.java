package Q578;

import java.util.Scanner;

class Gugu {
	private int num1;
	private int num2;

	public Gugu(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

	}

	public void Jungol() {
		int min = num1 < num2 ? num1 : num2;
		int max = num1 > num2 ? num1 : num2;

		for (int i = min; i <= max; i++) {
			System.out.println("== " + i + "dan" + " ==");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d%n", i, j, i * j);
			}
			System.out.println();
		}

	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		Gugu gu = new Gugu(num1, num2);
		gu.Jungol();

	}

}
