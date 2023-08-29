import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 
		int input = Integer.parseInt(br.readLine());
		
		int dot  = (int) (1 + Math.pow(2, input)); 
		System.out.println(dot * dot);
		
		
		
	}

}
