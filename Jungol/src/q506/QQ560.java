package q506;

import java.util.Scanner;

public class QQ560 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int min = num[0];

		for (int i = 0; i < num.length; ++i) {
			num[i] = sc.nextInt();
			if (min > num[i]) {
				min = num[i];
			}

		}
		System.out.println(min);
	}

}
	
	


