package Q613;

import java.util.Scanner;

public class School {

	String Name;
	String School;
	int Grade;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School s = new School();

		s.Name = sc.next();
		s.School = sc.next();
		s.Grade = sc.nextInt();
		sc.close();
		

		System.out.println("Name : " + s.Name);
		System.out.println("School : " + s.School);
		System.out.println("Grade : " + s.Grade);
		
		s.Name = "han ung";
		System.out.println(s.Name);

	}

}
