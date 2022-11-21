package Q615;

import java.util.Scanner;

public class Main4 {
	private String[] name;
	private int[] kor;
	private int[] eng;
	int koravg = 0;
	int engavg = 0;

	public Main4(String[] name, int[] kor, int[] eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;

		int korsum = 0;
		int engsum = 0;

		for (int i = 0; i < kor.length; i++) {
			korsum += kor[i];

		}
		koravg = korsum / kor.length;

		for (int i = 0; i < eng.length; i++) {
			engsum += eng[i];
		}
		engavg = engsum / eng.length;
	}

	public void print() {
		for(int i =0; i<kor.length;i++) {
		System.out.println(name[i] + " " + kor[i] + " " + eng[i]);
		}
		System.out.println("avg " + koravg + " " + engavg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		for (int i = 0; i < name.length; i++) {
			name[i] = sc.next();
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();

		}
		sc.close();

		Main4 mm = new Main4(name, kor, eng);

		mm.print();

	}

}
