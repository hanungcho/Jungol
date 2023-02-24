package Q603;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        int num, len;
        num = 0;
        len = s.length();
        char[] ch = new char[100];
 
        for (int i = 0; i < len; i++) {
            ch[i] = s.charAt(i);
            if (ch[i] == ' ') {
                num += 1;
            }
        }
 
        String[] arr = s.split(" ");
        for (int i = 0; i < num + 1; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
