package Q574;

import java.util.Scanner;

public class Main {
	public static 
	int max(int x, int y, int z) {
		int maxnum = 0;

		if (x > y && x > z) {
			maxnum = x;

		} else if (y > x && y > z) {
			maxnum = y;
		} else {
			maxnum = z;
		}
		return maxnum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		System.out.print(max(a, b, c));
	}

}

