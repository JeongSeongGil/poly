import java.util.Scanner;
public class Gugudan_method {
    public static int[] calculate(int times) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }

        return result;
    }

    public static void print(int[] result, int count) {
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d X %d = %d\n", count, (i+1), result[i]);
        }
    }

    public static void main(String[] args) {
    	// 메소드를 활용해 구구단 구현
        for (int i = 2; i < 10; i++) {
        	System.out.printf("%d 단\n", i);
            print(calculate(i), i);
            
            
        }
    }
}
