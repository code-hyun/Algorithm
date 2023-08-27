
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int rows = Integer.parseInt(st.nextToken());
	    int cols = Integer.parseInt(st.nextToken());
	    
	    int[][] arr_A = new int[rows][cols];
	    int[][] arr_B = new int[rows][cols];
	    
		for (int i = 0; i < arr_A.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < arr_A[i].length; j++) {
				arr_A[i][j] = Integer.parseInt(st.nextToken()); 
			}
			
		}
		for (int i = 0; i < arr_A.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < arr_A[i].length; j++) {
				arr_B[i][j] = Integer.parseInt(st.nextToken()); 
			}
			
		}
		for (int i = 0; i < arr_A.length; i++) {
			for (int j = 0; j < arr_A[i].length; j++) {
				System.out.print(arr_A[i][j] + arr_B[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
	}

}
