package Q1304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] n = new int[num][num];
		int con = 1;
		for (int i=0; i<n.length;i++) {
			for(int j=0; j<n.length;j++) {
				n[i][j] = con++;
			}
		}
		for(int i=0; i< n.length;i++) {
			for(int j=0; j<n.length;j++) {
				System.out.print(n[j][i]+" ");
			}
			System.out.println(" ");
		}

	}

}
