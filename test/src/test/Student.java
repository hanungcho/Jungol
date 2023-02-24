package test;

import java.util.Scanner;

class Student1 {
	
	private String Schoolname;
	private int graed;
	
	
	
	public String getSchoolname() {
		return Schoolname;
		
	}
	public int getfraed() {
		return graed;
	}
	
	public void input() {
		Scanner sc =new Scanner(System.in);
		String SChoolname = sc.next();
		int graed = sc.nextInt();
		sc.close();
	}
	
	public void print() {
		System.out.println(graed + "grade" +"in" + Schoolname + "School" );
	}
	

public static void main(String[] args) {
		Student1 st = new Student1();
		st.input();
		st.print();

	}

}

