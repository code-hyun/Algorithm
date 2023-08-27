

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stBuilder = new StringBuilder();
		char[][] chArr = new char[5][15];
		int max = 0;
		for (int i = 0; i < 5; i++) {
			String st = br.readLine();
			if(max < st.length()) {
				max = st.length();
			}
			for (int j = 0; j < st.length(); j++) {
				chArr[i][j] = st.charAt(j);
			}
		}
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if(chArr[j][i] == '\0') {
					continue;
				}
				stBuilder.append(chArr[j][i]);
			}
		}
		System.out.println(stBuilder);
	}	
}
 
      
     
      
      
