import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		String s1, s2;
		System.out.println("두 수를 입력해 주세요.");
		s1 = sc.next();
		s2 = sc.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		int result = a + b;
		System.out.printf("%d + %d = %d", a, b, result);
	}

}
