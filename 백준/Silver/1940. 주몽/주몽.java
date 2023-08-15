import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int meterialNum = sc.nextInt();
		int sum = sc.nextInt();
		int count=0;
		int[] meterials  = new int[meterialNum];
		
		for(int i=0; i<meterialNum; i++) {
			meterials[i] = sc.nextInt();
		}
		Arrays.sort(meterials);
		int i = 0;
		int j = meterialNum -1;
		
		while(i<j) {
			if(meterials[i]+meterials[j] < sum) {
				i++;
			}else if(meterials[i]+meterials[j] == sum) {
				count++;
				i++;
				j--;
				
			}else {
				j--;
			}
		}
		System.out.println(count);
	}

}
