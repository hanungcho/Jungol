package q506;

import java.util.Scanner;

public class Main2 {

	public double avg(int num) {
		return num * num * 3.14;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Main2 qq = new Main2();
		System.out.printf("%.2f", qq.avg(num));
		sc.close();

	}
}
