package test;

public class StringConcatExamole {

	public static void main(String[] args) {
	String str1 = "Java";
	String str2 = "JDK";
	
	String str3 = str1 + str2;
	String str4 = str1 + " " + str2;
	
	String str5 = "JDK" + 3 + 3.0;
	String str6 = 3 + 3.0 + "JDK";// 문자열로 취급하여 덧셈이 된다 
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);
	System.out.println(str6);

	}

}
