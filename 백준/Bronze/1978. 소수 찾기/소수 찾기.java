import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int input = Integer.parseInt(br.readLine());
      int count = 0;
      int factorCount = 0;
      
     
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for (int i = 1; i <= input; i++) {
    	  
    	  int num = Integer.parseInt(st.nextToken());
    	  
    	  for (int j = 1; j <= num; j++) {
    		  if(num%j == 0) {
    			  factorCount++;
    		  }
    	  }
    	  if(factorCount == 2) {
    		  count++;
    	  }
    	  
    	  factorCount = 0;
    	  
      }
      
      System.out.println(count);
	}

}
