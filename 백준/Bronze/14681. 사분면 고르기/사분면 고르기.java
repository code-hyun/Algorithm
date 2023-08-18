import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result =0;
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			
			if(x>0) {
				if(y>0) {
					result = 1;
				}else {
					result = 4;
				}
			}else {
				if(y>0) {
					result = 2;
				}else {
					result = 3;
				}
			}
			System.out.println(result);
	}

}
