import java.util.Scanner;

public class QQQz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sum = 0;
		double avg = 0;
		double num = 0;

		while (true) {
			double i = sc.nextDouble();
			sum += i;
			num++;

			avg = sum / num;
			if (i < 5)
				break;
		}
		System.out.println(sum);
		System.out.println(avg);

	}

}
