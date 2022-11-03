package q506;

import java.util.Scanner;

public class q533 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a = sc.next().charAt(0);
		int b = sc.nextInt();
		sc.close();

		if (a == 'm' && b <= 18) {
			System.out.println("Man");
		} else if (a == 'F' && b <= 18) {
			System.out.println("WOMAN");
		} else if (a == 'M' && b >= 18) {
			System.out.println("BOY");
		} else {
			System.out.println("GIRL");
		
			
		// if (c =='M') {
	  //system.out.println("MAN");
	 //} else { system.out.println("BOY");
			//} 
			
	// else { 
		// if (b >= 18) {
		// system.out.pirntln("WOMAN")
		//} else { system.out.println("GIRL"); }

		}
	}

}
	


