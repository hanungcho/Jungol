package Q602;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arr = new String[5];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextLine();

		}

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);

		}

	}
}

