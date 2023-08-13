import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> score = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			score.add(sc.nextInt());
		}
		
		int max = score.stream()
				.mapToInt(Integer::intValue) // int 변환
				.max() // 최대값 반환
				.orElse(0); // 값이 없을 경우 0 반환
        
		double sum = score.stream()
                    //DoubleStream으로 각 점수*100
					.mapToDouble(v -> v * 100)
					.sum(); // 합을 반환
        
		double avg = sum/max/num;
		System.out.println(avg);
	}

}