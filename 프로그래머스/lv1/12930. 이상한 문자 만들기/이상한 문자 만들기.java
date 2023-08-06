class Solution {
    public String solution(String s) {
        String splitWord[] = s.split(" ", -1);
        
        for(int i = 0; i < splitWord.length; i++){
            String[] str = splitWord[i].split("");
            for(int j =0; j<str.length; j++){
                if(j%2 == 0){
                    str[j] = str[j].toUpperCase();
                }else{
                    str[j] = str[j].toLowerCase();
                }
            }
            splitWord[i] = String.join("", str);
        }
        return String.join(" ", splitWord);
    }
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.solution("try hello world AdferG dfDqeDDSs"));
    }
}