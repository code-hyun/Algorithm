
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer strToken= new StringTokenizer(br.readLine(), " ");
		
		String[] st = new String[num];
		for (int i = 0; i < num; i++) {
			st[i] = strToken.nextToken(); 
		}
		String selectNum = br.readLine();
		
		for(int i=0; i<st.length; i++) {
			if(st[i].equals(selectNum)) {
				count++;
			}
				
		}
		System.out.println(count);
		
	}

}
