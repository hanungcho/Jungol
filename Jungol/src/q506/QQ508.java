package q506;

public class QQ508 {

	public static void main(String[] args) {
		String [] str = {"item","count","price",
				"pen","20","100",
				"note","5","95",
				"eraser","110","97"};
		for (int i = 0 ; i <=11; i++) {
			if ((i % 3) == 0 && i !=0) {
				System.out.printf("%n");
				System.out.printf("%10s", str[i]);
			}
		}

	}

}
