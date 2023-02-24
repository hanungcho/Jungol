package Q9041;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("점수를 입력하세요. ");
			int num = sc.nextInt();
			if(0< num && num < 80) {
				System.out.println("죄송합니다. 불합격입니다.");
			}else if (80<= num && num <= 100) {
				System.out.println("축하합니다. 합격입니다.");
			}else {
				sc.close();
				break;
			}
		}

	}

}
