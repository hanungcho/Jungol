package test;

public class IfExample {

	public static void main(String[] args) {
		int score = 60;
		
		if (score >= 90) {
			System.out.println("A"); //전체 한문장으로 해석 else 를 뺄경우 2문장으로해석
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {System.out.println("F");
		}

	}

}
