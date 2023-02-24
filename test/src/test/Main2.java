package test;

import java.util.Scanner;

class Student {

	private String Schoolname;
	private int graed;

	public Student(String Schoolname, int graed) {
		this.Schoolname = Schoolname;
		this.graed = graed;
	}

	public String getSchoolname() {
		return Schoolname;

	}

	public int getfraed() {
		return graed;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		String SChoolname = sc.next();
		int graed = sc.nextInt();
		sc.close();
	}

	public void print() {
		System.out.println(graed + "grade" + "in" + Schoolname + "School");
	}

}

public class Main2 {

	public static void main(String[] args) {
		

	}

}
