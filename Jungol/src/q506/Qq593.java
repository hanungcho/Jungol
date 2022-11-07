package q506;

import java.util.Scanner;

public class Qq593 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inp = 0; //초기화 하는 습관
		do {
			System.out.print("ASCII code");
			inp = sc.nextInt();
			if(inp <33 || inp > 127) {
				break;
			}
			System.out.printf("%c\n",inp);
		}while(33 <= inp %% inp <= 127);
		sc.close();
		
		}

	}


