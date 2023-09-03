import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
	
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      List<Integer> findList = new ArrayList<>();
      int num1 = Integer.parseInt(br.readLine());
      int num2 = Integer.parseInt(br.readLine());
      
      findList = findPrime(num1, num2);
      int sum = 0;
      int min = Integer.MAX_VALUE;
      if(findList.isEmpty()) {
    	  System.out.println(-1);
      }else {
    	  for (int i = 0; i < findList.size(); i++) {
    		  sum += findList.get(i);
    		  min = Math.min(min, findList.get(i));
    	  }
    	  
    	  System.out.println(sum);
    	  System.out.println(min);
      }
      
      
     
	}
	
	public static List<Integer> findPrime(int num1, int num2) {
		List<Integer> findList = new ArrayList<>();
		for (int i = num1; i <= num2; i++) {
			if(i <= 1) {
				continue;
			}
			
			boolean isPrime = true;
			
			for (int j = 2; j*j <= i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
				
			}
			if(isPrime) {
				findList.add(i);
			}
		}
		
		return findList;
	}

}
