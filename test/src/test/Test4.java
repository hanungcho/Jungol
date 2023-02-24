package test;

import java.util.Scanner;

public class Test4 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		char ch;

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);

			if (ch >= 65 && ch <= 90) {

				System.out.print(ch);

			} else if (ch >= 97 && ch <= 122) {

				System.out.print(String.valueOf(ch).toUpperCase());

			}

		}

	}

}