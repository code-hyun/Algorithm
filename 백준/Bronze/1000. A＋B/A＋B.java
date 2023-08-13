import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt(); // 첫 번째 정수 입력
        int B = scanner.nextInt(); // 두 번째 정수 입력
        
        int sum = A + B; // A와 B의 합
        
        System.out.println(sum); // 합을 출력
    }
}