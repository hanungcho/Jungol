package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		sc.close();

		int sum = num1 + num2 + num3;
		int avg = sum / 3;

		System.out.println("sum :" + sum);
		System.out.println("agv :" + avg);
//소수점 자리까지 표현하겠다 하면 
//		dobule agv = (dobyle) sum / 3; 
//		System.out.printl(avg : %.3f\n, avg); //소수점 3자리까지 표현하겠다 
		// 여기서 .3은 3자리까지  표현하겠다 f는 실수 슬러시엔까지 써준다
	}

}
