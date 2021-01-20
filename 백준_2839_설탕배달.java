import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int bag = Integer.parseInt(br.readLine());
			int count = 0;
			
			int a = bag / 5;
			while((bag - 5*a) % 3 != 0) {
				a--;
			}
			
			if(a > 0) {
				count += a + (bag - 5*a) / 3;
			}
			else { // a == 0
				count = (bag % 3 == 0) ? (bag / 3) : (-1);
			}
			
			bw.write(String.valueOf(count));
			
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}