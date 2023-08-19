
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i =0; i< num; i++) {
			String[] resultStr = br.readLine().split(" ");
			int a = Integer.parseInt(resultStr[0]);
			int b = Integer.parseInt(resultStr[1]);
			int sum = a+b;
			
			wr.write(Integer.toString(sum));
			wr.newLine();
		}
		
		wr.flush();
	}
	

}
