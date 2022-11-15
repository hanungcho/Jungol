import java.util.Scanner;

public class QQQQQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sum = 0;
		double avg = 0;

		for (int i = 1; i <= 5; i++) {
			double a = sc.nextDouble();
			sum += a;

			if (i == 5) {
				System.out.println(sum);
				System.out.println(sum / i);

			}
		}

	}
}
