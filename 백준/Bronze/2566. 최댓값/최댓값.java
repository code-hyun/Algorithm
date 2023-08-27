

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		int[][] arr = new int[9][9];
        int max = -1; 
        int maxRow = -1; 
        int maxCol = -1; 

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((maxRow + 1) + " " + (maxCol + 1));
    }
	
	

}


