import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalScore = 0;
        double totalCredits = 0;
        HashSet<String> subjectCheck = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            // 중복된 과목인지 확인
            if (!subjectCheck.add(subject)) {
                System.out.println("중복된 과목입니다.");
                return;
            }

            // 학점이 'P'가 아닌 경우에만 계산에 포함
            if (!grade.equals("P")) {
                totalScore += change(grade) * credit;
                totalCredits += credit;
            }
        }

        System.out.printf("%.4f\n", totalScore / totalCredits);  // 결과 출력
    }

    public static double change(String grade) {
        double score = 0;
        switch (grade) {
            case "A+":
                score = 4.5;
                break;
            case "A0":
                score = 4.0;
                break;
            case "B+":
                score = 3.5;
                break;
            case "B0":
                score = 3.0;
                break;
            case "C+":
                score = 2.5;
                break;
            case "C0":
                score = 2.0;
                break;
            case "D+":
                score = 1.5;
                break;
            case "D0":
                score = 1.0;
                break;
            case "F":
                score = 0.0;
                break;
        }
        return score;
    }
}
