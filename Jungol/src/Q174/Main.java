package Q174;

import java.util.Scanner;

public class Main {
    public static void answer(int[][] n) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j] = sc.nextInt();
                arr[i][j] = n[i][j];
                arr[i][3] += n[i][j];
                arr[3][j] += n[i][j];
                arr[3][3] += n[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        answer(arr);
    }
}
