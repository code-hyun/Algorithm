import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		String num2 = sc.next();
		
		
		
		String[] splitNum2 = num2.split("");
		int[] result = new int[splitNum2.length];
		for(int i =0; i<splitNum2.length; i++) {
			result[i] = Integer.parseInt(splitNum2[i]) * num1;
		}
		
		for(int i = 0; i<splitNum2.length; i++) {
			System.out.println(result[splitNum2.length-i-1]);
			
		}
		System.out.println(num1 * Integer.parseInt(num2));
		
		
		
		
	}

}