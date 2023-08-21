
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Set<Integer> submittedStudents = new HashSet<>();

	        // 28명의 학생이 제출한 출석번호를 입력받아서 Set에 저장합니다.
	        for (int i = 0; i < 28; i++) {
	            int submittedNumber = scanner.nextInt();
	            submittedStudents.add(submittedNumber);
	        }

	        // 제출하지 않은 학생의 출석번호를 찾아냅니다.
	        int firstMissing = -1;
	        int secondMissing = -1;
	        for (int i = 1; i <= 30; i++) {
	            if (!submittedStudents.contains(i)) {
	                if (firstMissing == -1) {
	                    firstMissing = i;
	                } else {
	                    secondMissing = i;
	                    break;
	                }
	            }
	        }
	        if(firstMissing < secondMissing) {
	        	System.out.println(firstMissing);
		        System.out.println(secondMissing);
	        }else {
	        	System.out.println(secondMissing);
	        	System.out.println(firstMissing);
	        	
	        }
	        
	    }
	}