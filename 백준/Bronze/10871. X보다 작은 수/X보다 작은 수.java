
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer strToken= new StringTokenizer(br.readLine(), " ");
		int arrayNum = Integer.parseInt(strToken.nextToken());
		int num = Integer.parseInt(strToken.nextToken());
		
		StringTokenizer numToken = new StringTokenizer(br.readLine(), " ");
		int[] array = new int[arrayNum];
		
		for (int i = 0; i < arrayNum; i++) {
			
			array[i] = Integer.parseInt(numToken.nextToken()); 
		}
		
		for(int i=0; i < array.length; i++) {
			if(array[i] < num) {
				
				sb.append(array[i]).append(" ");
			}
				
		}
		System.out.println(sb.toString());
		
		br.close();
		
	}

}
