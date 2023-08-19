import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			for (int j = 0; j < num - (i+1); j++) {
				System.out.print(" ");
			}
			for(int j =0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
