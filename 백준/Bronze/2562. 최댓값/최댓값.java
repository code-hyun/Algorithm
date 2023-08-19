import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int array[] = new int[9];
		String result = "";
		
		for(int i =0; i < 9; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int start = 0;
		int end = 8;
		int max = array[0];

		while(start <= end) {
			max = Math.max(max, array[start]);
			start++;
			
		}
				
		
		
		System.out.println(max);
		System.out.println(findIndex(array, max));
		
	}
	public static int findIndex(int[] array, int target) {
		int index = -1;
		for(int i =0; i < array.length; i++) {
			if(array[i] == target) {
				index = i+1;
				break;
			}
		}
		return index;
	}

}
