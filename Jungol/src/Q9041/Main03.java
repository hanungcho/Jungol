package Q9041;

import java.util.Scanner;

class Check {
	private String ask = "점수를 입력하세요. ";
	private String pass = "축하합니다. 합격입니다.";
	private String fail = "죄송합니다. 불합격입니다.";

	public void scoreCheck() {
		Scanner in = new Scanner(System.in);
		boolean keep = true;

		while (keep) {
			System.out.print(ask);
			int score = in.nextInt();
			if (score >= 0 && score <= 100) {
				if (score >= 80) {
					System.out.println(pass);
				} else {
					System.out.println(fail);
				}
			} else {
				in.close();
				keep = false;
			}
		}
	}
}

public class Main03 {
	public static void main(String[] args) {
		Check amI = new Check();

		amI.scoreCheck();
	}
}