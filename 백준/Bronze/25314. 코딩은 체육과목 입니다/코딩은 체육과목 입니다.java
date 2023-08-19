
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Repeatable;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		String longStr = "";
		
		for(int i = 0; i<input/4; i++) {
			longStr += "long ";
			
		}
		System.out.println(longStr + "int");
	}
	

}
