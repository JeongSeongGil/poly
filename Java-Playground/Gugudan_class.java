
public class Gugudan_class {

	public static void main(String[] args) {
		// 메소드를 활용해 구구단 구현
		for (int i = 2; i < 10; i++) {
			System.out.printf("%d 단\n", i);
			Gugudan_method.print(Gugudan_method.calculate(i), i);

		}

	}
}
