import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    // 오름차순 정렬
    Arrays.sort(arr);
    
    for(int i=0; i<n; i++){
        System.out.println(arr[i]);
    }
  }
}
