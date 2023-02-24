package Q171;

import java.util.Scanner;

class Main2 {
	private int num;

	public Main2(int num) {
		this.num = num;
	}

	public void Jungol() {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;

		}

		System.out.println(sum);

	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		Main2 jj = new Main2(num);

		jj.Jungol();

	}
}
