package Q1338;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        char[][] charArr = new char[n][n];
         
        char start = 'A';
 
        for(int i = 0; i <= n; i++) {
            int k = n-1;
            for(int j = i; j < n; j++) {
                if(start > 'Z') start = 'A';
                charArr[j][k--] = start++;
            }
        }
         
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(charArr[i][j] == '\0') System.out.print("  ");
                else System.out.print(charArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}