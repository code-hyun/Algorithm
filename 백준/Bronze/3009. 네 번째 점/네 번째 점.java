import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> find_x = new ArrayList<>();
        List<Integer> find_y = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            find_x.add(x);
            find_y.add(y);
        }

        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();

        for (int i = 0; i < find_x.size(); i++) {
            xSet.add(find_x.get(i));
            ySet.add(find_y.get(i));
        }
        
        int result_x = 0;
        int result_y = 0;
        
        for (int i = 0; i < find_x.size(); i++) {
            int countX = Collections.frequency(find_x, find_x.get(i));
            int countY = Collections.frequency(find_y, find_y.get(i));
            
            if (countX == 1) {
                result_x = find_x.get(i);
            }
            if (countY == 1) {
                result_y = find_y.get(i);
            }
        }
        
        System.out.println(result_x + " " + result_y);
    }
}
