package Q123;

import java.util.Scanner;

class Animal {
	private int num;

	public Animal(int num) {
		this.num = num;
	}

	public void jungol() {
		switch (num) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know.");
		}

	}

	public class Main2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int num = sc.nextInt();
			Animal aa = new Animal(num);
			aa.jungol();

		}
	}

}

