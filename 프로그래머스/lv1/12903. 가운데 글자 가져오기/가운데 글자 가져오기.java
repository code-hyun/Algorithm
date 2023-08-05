class Solution {
    public static String solution(String s) {
         String result = "";
        if (s == null || s.length() < 1 || s.length() > 100) {
            result = "s의 길이는 1 이상, 100이하로 입력해야 합니다.";
            return result;
        }

        if(s.length() % 2 == 0){
            result = s.charAt(s.length() / 2 - 1) + "" + s.charAt(s.length() / 2);
        }else if(s.length() % 2 == 1){
            result = s.charAt(s.length() / 2) + "";
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(solution("abcffdedf"));

    }
                     
}