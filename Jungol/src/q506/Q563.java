package q506;


import java.util.Scanner;

public class Q563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 10개 정수 입력받고
		// 배열에 저장
		// 내림차순 정렬후 출력
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();

		}

		for (int i = 0; i < num.length; i++) {
		for (int j = 0; j < num.length - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j+ 1] = temp;
					
					
				}
			}
		}
		for(int i =9 ; i >= 0; i-- ) {
			System.out.print(num[i]+" ");
		}

	
	}
}
