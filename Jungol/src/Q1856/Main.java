package Q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int[][] ar = new int[a][b];
		int num = 1;
		for (int i = 0; i < a; i++) {
			if (i % 2==0) {
			 for (int j = 0; j < b; j++) {
				ar[i][j] = num++;
			}
		}else {
		
		for(int j =b-1; j>=0; j--) {
			ar[i][j] = num++;
				}
				
			}
		
		}
		for(int i =0; i<a;i++) {
			for (int j=0; j < b;j++) {
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
