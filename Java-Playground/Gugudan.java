import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		
		// 구구단 구현

		Scanner s = new Scanner(System.in);
		System.out.print("입력 => ");
		int count = s.nextInt();

		for (int i = 1; i <= count; i++) {
			
			if (count > 9 || count < 2) {
				System.out.print("값을 잘못 입력했습니다.");
				break;
			}

			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				int result = i * j;
				System.out.printf("%d X %d = %d\n", i, j, result);
			}
			System.out.println();
		}

		// 배열로 구구단 구현
		
		int[] result = new int[9];
		for (int i = 2; i < 10; i++) {
			
			System.out.printf("%d 단\n", i);
			for (int j = 0; j < 9; j++) {
				result[j] = (i * (j+2));
				System.out.printf("%d X %d = %d\n", i, (j+2), result[j]);
				

				
			}
			System.out.println();

			
		}
		
	}

}
