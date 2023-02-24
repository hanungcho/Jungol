import java.util.Scanner;

public class Q112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		System.out.printf("%d / %d = %d...%d", a, b, a / b, a % b);

	}

}
