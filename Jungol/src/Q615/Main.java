package Q615;

import java.util.Scanner;

class Maintest {
	private String name;
	private int kor;
	private int eng;

	Maintest(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}
	
	public int getkor(){
		return kor;
	}
	public int geteng() {
		return eng;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Maintest[] mm = new Maintest[2];
		for (int i = 0; i < mm.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			mm[i] = new Maintest(name, kor, eng);
			
		}
		for (int i = 0; i < mm.length; i++) {
			mm[i].print();

		}
		int sumkor =0; int sumeng=0;
		for (int i = 0 ; i <mm.length;i++) {
			sumkor += mm[i].getkor();
			sumeng += mm[i].geteng();
					
		}
		System.out.println("avg " +sumkor/mm.length+" "+sumeng/mm.length);

	}
}