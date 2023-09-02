import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String numStr = br.readLine();
			int sum = 0;
			List<Integer> factorList = new ArrayList<>();
			
			if (numStr.equals("-1")) {
				break;
			}
			
			int num = Integer.parseInt(numStr);
			
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					factorList.add(i);
					sum += i;
				}
			}
			
			sb.append(numStr);
			if (sum == num) {
				sb.append(" = ").append(factorList.get(0));
				for (int i = 1; i < factorList.size(); i++) {
					sb.append(" + ").append(factorList.get(i));
				}
			} else {
				sb.append(" is NOT perfect.");
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}
