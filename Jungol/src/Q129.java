import java.util.Scanner;

public class Q129 {

	public static void main(String[] args) {
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			avg = (double) base * (double) height / 2;
			System.out.printf("Triangle width = %.1f\n", avg);
			System.out.print("Continue? ");
			char c = sc.next().charAt(0);
			if (c == 'y' || c == 'Y') {
				//continue;
			} else
				sc.close();
				break;

		}

	}

}
