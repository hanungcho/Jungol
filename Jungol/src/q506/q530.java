package q506;

import java.util.Scanner;

public class q530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();

		if (age >= 20) {
			System.out.println("adult");
		} else {
			int a = 20 - age;
			System.out.println(a + "years lather");
			//system.out.printlm(20 - age "years lather");
		}

	}

}