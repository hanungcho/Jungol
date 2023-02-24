package Q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		int con;
		char[] c= new char[len];
		sc.close();
		
		for (int i=0;i<len;i++) {
			c[i]=str.charAt(i);
		}
		for (int i = 0; i < len; i++) {
            con = len - 1 - i;
            for (int j = 0; j < len; j++) {
                if (con == len) {
                    con = 0;
                }
                System.out.print(c[con]);
                con++;
            }
            System.out.println();
        }
    }
}
