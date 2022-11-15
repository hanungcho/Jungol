import java.util.Scanner;

public class QQQzzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];

		}
//		int max = arr[0];
//
//		for (int i = 1; i < arr.length; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//			}}
//			sc.close();
			
			System.out.println(min);
			//System.out.println(max);

		}
	}

