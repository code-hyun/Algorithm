import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String sNum = sc.next();
		int sum = 0;
		
		for(int i =0; i<sNum.toCharArray().length; i++) {
			sum += Integer.parseInt(sNum.charAt(i) + ""); 
		}
		System.out.println(sum);
		
	}

}