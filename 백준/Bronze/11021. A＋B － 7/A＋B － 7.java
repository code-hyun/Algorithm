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
		
		int n = Integer.parseInt(br.readLine());
		String st = "Case #";
		for(int i=0; i<n; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			int sum = a+b;
			
			wr.write(st+(i+1) + ": " + sum);
			wr.newLine();
			
		}
		wr.flush();
	}

}
