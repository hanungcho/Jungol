package q506;

import java.util.Scanner;

public class qq534 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a = sc.next().charAt(0);
		sc.close();
		switch (a) {
		case 'A':
			System.out.println("Excellent");
			break;

		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Usually");
			break;
		case 'D':
			System.out.println("Effort");
			break;
		case 'F':
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
			break;

		}

	}

}
