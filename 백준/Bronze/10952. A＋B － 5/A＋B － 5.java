import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer str = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			int sum = a+b;
			
			if(a == 0 && b ==0) {
				break;
			}
			
			wr.write(Integer.toString(sum));
			wr.newLine();
			
			
			
		}
		wr.flush();
	}

}
