package Q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			char c = sc.next().charAt(0);
			if (c >= 65 && c <= 90) {
				System.out.println(c);
			} else if (c >= 97 && c <= 122) {
				System.out.println(c);
			} else if (c >= 48 && c <= 57) {
				System.out.println((int) c);
			} else {
				break;
			}

		}sc.close();

	}
}
