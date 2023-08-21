import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repitation = Integer.parseInt(br.readLine()) ;
		
		List<String> strList = new ArrayList<>();
		
		for (int i = 0; i < repitation; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			String b = st.nextToken();
			
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < b.length(); j++) {
				for (int k = 0; k < a; k++) {
					sb.append(b.charAt(j));
				}
			}
			strList.add(sb.toString());
			
		}
		for(String str : strList) {
			System.out.println(str);
		}
		
		
	}

}
