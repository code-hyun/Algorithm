import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int Repetition = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < Repetition; i++) {
			String st = br.readLine();
			
			wr.append(String.valueOf(st.charAt(0)) + String.valueOf(st.charAt(st.length()-1)));
			wr.newLine();
		}
		wr.toString();
		wr.flush();
	}

}
