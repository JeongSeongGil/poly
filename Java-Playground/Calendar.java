import java.util.Scanner;

public class Calendar {
	public static void printMenu() {
		System.out.println("\n+---------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 보기");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료 ");
		System.out.println("+---------------------+\n");
	}

	private static void cmdCal(int year, int month, int start_day) {
		printCalendar(year, month, start_day);
	}

	private static String cmdRegister(Scanner s) {
		System.out.println("[새 일정 등록]");
		System.out.printf("날짜를 입력해 주세요(yyyy-MM-dd).   : ");
		String date = s.nextLine();
		System.out.printf("일정을 입력해 주세요.   : ");
		String text = s.nextLine();
		String sc = "|" + date + "\n- " + text + "\n\n";
		return sc;

	}

	public static void printCalendar(int year, int month, int start_day) {

		/* 일 (1), 월(2) ... 토(0) */

		int s_value = 0;
		switch (start_day) {
		case 0: // 일
			s_value = 1;
			break;
		case 1: // 월
			s_value = 2;
			break;
		case 2:
			s_value = 3;
			break;
		case 3:
			s_value = 4;
			break;
		case 4:
			s_value = 5;
			break;
		case 5:
			s_value = 6;
			break;
		case 6: // 토
			s_value = 7;
			break;
		}
		int day = MAX_DAYS[month - 1];
		if (year % 4 == 0 && year % 100 != 0 && day == 28)
			day = 29;
		System.out.printf(" %d월\n", month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
		for (int i = 1; i < s_value; i++) {
			System.out.printf("   ");
		}
		for (int i = 1; i <= day; i++) {
			System.out.printf("%3d", i);
			if (s_value == 7) {
				System.out.println();
				s_value = 0;
			}
			s_value += 1;
		}
		System.out.println("\n");

	}

	private final static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		StringBuffer Schedule = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.printf("year ==> ");
		String year_str = sc.nextLine();
		System.out.printf("month ==> ");
		int month = sc.nextInt();
		String[] arr_year = year_str.split("");
		int a = Integer.valueOf(arr_year[0] + arr_year[1]);
		int b = Integer.valueOf(arr_year[2] + arr_year[3]);
		int year = Integer.valueOf(year_str);
		int start_day = ((int) (21 * a / 4) + (int) (5 * b / 4) + (int) (26 * (month + 1) / 10) + 1 - 1);
		start_day %= 7;
		printMenu();
		String c = sc.nextLine();
		while (true) {
			if (month <= 12 && month >= 1) {
				System.out.printf("cmd ==> ");
				String cmd = sc.nextLine();

				if (cmd.equals("1")) {
					Schedule.append(cmdRegister(sc));
				} else if (cmd.equals("2")) {
					System.out.println(Schedule.toString());
				} else if (cmd.equals("3")) {
					cmdCal(year, month, start_day);
				} else if (cmd.equals("h")) {
					printMenu();
				} else if (cmd.equals("q"))
					break;

			} else {
				System.out.println("1 ~ 12사이의 값 입력");
				System.out.printf("month ==> ");
				month = sc.nextInt();
			}
		}
	}
}