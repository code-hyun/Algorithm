import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String st = br.readLine().toUpperCase();
      int[] countNum = new int[26];
      
      for (int i = 0; i < st.length(); i++) {
    	 int N = st.charAt(i) - 'A';
    	 countNum[N]++;
      }
      int max = 0;
      char result = '?';
      for(int i =0; i<countNum.length; i++) {
    	  if(max < countNum[i]) {
    		  max = countNum[i];
    		  result = (char)(i+'A');
    	  }else if(max == countNum[i]) {
    		  result = '?';
    	  }
      }
      System.out.println(result);
      
	}
}
