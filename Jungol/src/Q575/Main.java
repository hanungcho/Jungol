package Q575;

import java.util.Scanner;

public class Main {
	public int xy(int x, int y) {
		int result1 = x;
		for (int i = 1; i < y; i++) {
			result1 *= x;
			}
		if(y==0) {
			return 1;
		}
		
		return result1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x <=10 && y <=10)
		sc.close();

		Main tv = new Main();

		System.out.println(tv.xy(x, y));

	}

}
