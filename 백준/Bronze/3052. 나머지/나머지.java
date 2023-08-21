import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set resultSet = new HashSet<>();
		int [] arr = new int[10];
		
		for(int i =0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<arr.length; i++) {
			resultSet.add(arr[i]%42);
		}
		System.out.println(resultSet.size());
		
		
		
		
	}

}
