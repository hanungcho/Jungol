package test;

public class CharExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 200L;
		long var3 = 10000000000000L;
//		대문자 L입력시 롱타입으로 인식하여 오류없이 출력가능 
//		L미입력시 int값으로 표현되기 떄문에 
		long var4 = 10000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}
}
