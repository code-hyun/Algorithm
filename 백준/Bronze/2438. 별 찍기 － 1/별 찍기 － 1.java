import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = "";
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			st += "*";
			System.out.println(st);
		}
	}

}
