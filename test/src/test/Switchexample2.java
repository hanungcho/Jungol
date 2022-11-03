package test;

public class Switchexample2 {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("현재시간 :" + time);

		switch (time) {
		case 8:
			System.out.println("출근합니다");
		case 9:
			System.out.println("회의를 합니다");
		case 10:
			System.out.println("업무를 봅니다");
		default: //뜻은 기본 11이 나왔을때 디폴트가 적용 
			// 지정되지 않았을때 주어진 케이스가 없을시 나머지 값이나올때 
			System.out.println("외근을 나갑니다");
			// 0.0 <= Math.random() < 1.0
			// 0.0 <= m *4 < 4.0
			// 0 <= (int)(m *4) <4
			// 8 <= (int)(m *4) +8 < 12
			// 8 9 10 11
		}

	}

}
