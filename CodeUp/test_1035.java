import java.util.Scanner;
public class test_1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		String rl_value = Integer.toOctalString(Integer.parseInt(value, 16));
		System.out.println(rl_value);
		
	}

}
