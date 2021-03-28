import java.util.Scanner;

public class Gugudan_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();

		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		
		
		for (int i = 2; i < first + 1; i++) {
			System.out.printf("%d 단\n", i + 1);
			for (int j = 1; j < second + 1; j++) {
				System.out.printf("%d X %d = %d\n", i, j, (i * j));

			}
			System.out.println();
		}

	}

}
