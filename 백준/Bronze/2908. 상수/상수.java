import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<String> strListA = new ArrayList<>();
		List<String> strListB = new ArrayList<>();
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		
		int a = result(reverse(strListA, A));
		int b = result(reverse(strListB, B));
		
		int result = a > b ? a : b;
		System.out.println(result);
		
		
			
		
	}
	public static List<String> reverse(List<String> strList, String str){
		for (int i = 0; i < str.length(); i++) {
			strList.add(str.split("")[i]);
		}
		Collections.reverse(strList);
		return strList;
	}
	public static int result(List<String> strList) {
		String temp = "";
		for (int i = 0; i < strList.size(); i++) {
			temp += strList.get(i);
		}
		return Integer.parseInt(temp);
	}

}
