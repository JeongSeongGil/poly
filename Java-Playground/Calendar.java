import java.util.Scanner;

public class Calendar {
	public static void printCalendar(int year, int month, String week) {
		int s_value = 0;
		if (week.equals("mo")) { // equals / week.equals("χ") = χ와 week값 비교 (bool 값 반환)
			s_value = 1;
			System.out.println("asd");

		}
		if (week.equals("tu")) {
			s_value = 2;

		}
		if (week.equals("we")) {
			s_value = 3;

		}
		if (week.equals("th")) {
			s_value = 4;

		}
		if (week.equals("fr")) {
			s_value = 5;

		}
		if (week.equals("sa")) {
			s_value = 6;

		}
		int day = MAX_DAYS[month - 1];
		System.out.printf(" %d월\n", month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
		if (year % 4 == 0 && year % 100 != 0 && day == 28)
			day = 29;
		for (int i = 1; i <= s_value; i++) {
			System.out.printf("   ");
		}
		for (int i = 1; i <= day; i++) {
			System.out.printf("%3d", i);
			if (s_value == 6) {
				System.out.println();
				s_value = -1;
			}
			s_value += 1;
		}

	}

	private final static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.printf("year ==> ");
			int year = sc.nextInt();
			System.out.printf("month ==> ");
			int month = sc.nextInt();
			System.out.printf("Start / Day of Week ( ex.) Monday : mo ) ==> ");
			String skip = sc.nextLine();
			String startDofW = sc.nextLine(); // Day of Week, 시작 요일
			if (month <= 12 && month >= 1) {
				printCalendar(year, month, startDofW);
				break;
			} else {
				System.out.println("1 ~ 12사이의 값 입력");
				continue;
			}
		}
	}
}
