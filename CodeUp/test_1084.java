import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test_1084{
	public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String a = br.readLine();
			int count = 0;
			String[] b = a.split(" ");
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				for (int i = 0; i < Integer.valueOf(b[0]); i++) {
					for (int j = 0; j < Integer.valueOf(b[1]); j++) {
						for (int k = 0; k < Integer.valueOf(b[2]); k++) {
							bw.write(i + " " + j + " " + k + "\n");
							count++;
						}
					}
				}
			bw.write(String.valueOf(count));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
