package test;

import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[100];
		String str = sc.next();
		sc.close();

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z') {
				System.out.print(String.valueOf(ch[i]).toLowerCase());
			}
		}// .toString() // String.valueOf 문자열 형태로 데이터 변환 
		// toUpperCase 문자열을 대문자로 반환
		// toLowerCase 문자열을 소문자로 반환
 	}
}