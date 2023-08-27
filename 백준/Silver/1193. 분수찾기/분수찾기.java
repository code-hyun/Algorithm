import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int line = 1;
		int x, y;
		while(true) {
			if(line * (line + 1)/2 >= input) {
				
				if(line % 2 == 0) {
					x = input - line*(line-1)/2;
					y = line+1-x;
					
				}else {
					y = input - line*(line-1)/2;
					x = line+1-y;
				}
				
				System.out.println(x + "/" + y);
				break;
				
			}
			line++;
		}
		
	}

}
