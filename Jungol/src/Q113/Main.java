package Q113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int width = sc.nextInt();
		int length = sc.nextInt();
		int sum = width + 5;
		int sum2 = length*2;
		int sum3 = sum * sum2;
		
		System.out.println("Width = " + sum);
		System.out.println("lenght = " + sum2);
		System.out.println("area = " + sum3);
		

	}

}
