package Q124;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();

		switch (num) {
		case 2:
			System.out.println(28);
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30);
			break;
		default:
			System.out.println(31);
			break;

		}
	}

}

