package q506;

import java.util.Scanner;

public class Q557 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[10];

		for (int i = 0; i <= ch.length; i++) {

			ch[i] = sc.next().charAt(0);
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i] + "");
			System.out.println(ch[0] + "" + ch[3] + "" + ch[6]);

		}
		//System.out.println(ch[0] + "" + ch[3] + "" + ch[6]);
	}
}
