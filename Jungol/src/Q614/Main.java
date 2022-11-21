package Q614;

import java.util.Scanner;

public class Main {
	String School = "Jejuelementary School";
	int grade = 6;
	String School2;
	int grade2;

	public static void main(String[] args) {
		Main s = new Main();
		Scanner sc = new Scanner(System.in);
		s.School2 = sc.next();
		s.grade2 = sc.nextInt();

		System.out.println(s.grade + " grade in " + s.School);
		System.out.println(s.grade2 + " grade in " + s.School2+ " School");

	}

}
