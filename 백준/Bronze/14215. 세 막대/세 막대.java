import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> tri = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 3; i++) {
			int input = Integer.parseInt(st.nextToken());
			tri.add(input);
		}
		
		Collections.sort(tri);
		int tri_a = tri.get(0);
		int tri_b = tri.get(1);
		int tri_c = tri.get(2);
		
		if(tri_a+ tri_b <= tri_c) {
			tri_c = tri_a + tri_b - 1;
		}
		
		System.out.println(tri_a + tri_b + tri_c);
		
	}
	
}
