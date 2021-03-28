import java.util.Scanner;

public class test_1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		for (int i = 1; i <= value; i++) {
			if (i % 3 == 0) {
				System.out.printf("X");
				if (i > 10 && (i % 10) % 3 == 0) {
					System.out.printf("X");
				}
			} else {
				System.out.printf("%d", i);
			}
			System.out.printf(" ");
		}
	}

}
