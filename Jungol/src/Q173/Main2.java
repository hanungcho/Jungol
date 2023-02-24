package Q173;

import java.util.Scanner;

class integer {
	private int num;
	private int num2;

	public integer(int num, int num2) {
		this.num = num;
		this.num2 = num2;
	}

	public void print() {
		int result = 0;
		if (num > num2) {
			result = (num * num) - (num2 * num2);
			System.out.println(result);
		} else if (num < num2) {
			result = (num2 * num2) - (num * num);
			System.out.println(result);
		}

	}
}

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		integer in = new integer(num, num2);
		in.print();

	}

}
