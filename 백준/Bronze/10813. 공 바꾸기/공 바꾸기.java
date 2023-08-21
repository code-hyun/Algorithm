import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int basketSize = Integer.parseInt(st.nextToken());
		int repeat = Integer.parseInt(st.nextToken());
		
		int[] basketArray = new int[basketSize];
		for (int i = 0; i < basketArray.length; i++) {
			basketArray[i] = i+1;
			
		}
	
		
		for(int i =0; i < repeat; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			change(a, b, basketArray);
		}
		
		for (int i = 0; i < basketArray.length; i++) {
			
			System.out.print(basketArray[i] + " ");
		}
	}
	
	public static int[] change(int a, int b, int[] array) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		
		return array;
		
	}

}
