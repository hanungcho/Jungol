package q506;

import java.util.Scanner;

public class Q596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String[] str = new String[100];

		String sce = sc.nextLine();
		int a = sc.nextInt();
		sc.close();

		for (int i = sce.length() - 1; a > 0; i--, a--) {
			System.out.print(sce.charAt(i));

		}
	}

}
