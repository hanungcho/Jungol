package q506;

import java.util.Scanner;

public class a531 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double w = sc.nextDouble();

		if (w <= 50.80) {
			System.out.println("Flyweight");
		} else if (w <= 61.23) {
			System.out.println("Lightweight");
		} else if (w <= 72.57) {
			System.out.println("Middlieweight");
		} else if (w <= 88.45) {
			System.out.println("Chruiserweight");
		} else {
			System.out.println("Heavyweight");
		}

	}

}


