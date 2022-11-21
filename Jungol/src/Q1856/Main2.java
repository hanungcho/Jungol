package Q1856;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// int[][] num = new int[n][m];
		sc.close();

		int num = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i % 2 == 0) {
					System.out.print(++num + " ");
				} else if (i % 2 == 1) {
					System.out.print(num-- + " ");
				}
			}
			num += m;
			System.out.println();
		}
	}
}
