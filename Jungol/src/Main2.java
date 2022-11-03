import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int num1 = (a + 100);
		int num2 = (b % 10);

		System.out.println(num1 + " " + num2);

	}

}
