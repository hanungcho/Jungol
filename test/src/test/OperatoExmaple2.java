package test;

public class OperatoExmaple2 {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;

		int result1 = v1 + v2;
		System.out.println("result1 : " + result1);

		int result2 = v1 - v2;
		System.out.println("reuslt2 :" + result2);

		int result3 = v1 * v2;
		System.out.println("reuslt3 :" + result3);

		int result4 = v1 / v2;
		System.out.println("reuslt4 :" + result4);

		int result5 = v1 % v2;
		System.out.println("reuslt5 :" + result5);

		double result6 = (double) v1 / v2;
		System.out.println("reuslt6 :" + result6);
//나누기 값에 계산값이 실수가 나와야 하는 상황에서는 정확하게 double를 넣어줘야 한다
	}

}
