package q506;

import java.util.Scanner;

public class Q535 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float score = sc.nextFloat();
		sc.close();
		switch ((int) score) {
		case 4:
			System.out.println("scholarship");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 2:
			System.out.println("seasonal semester");
			break;
		default:
			System.out.println("retake");
			break;

		}

	}

}
