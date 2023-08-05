class Solution {
    public int solution(String s) {
        
        String stringCheck = s.startsWith("-") ? s.substring(1) : s;
        if(s.length() < 1 || s.length() > 5){
            throw new IllegalArgumentException("1이상 5이하 제한");
        }
        try {
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return s.startsWith("-") ? -Integer.parseInt(stringCheck) : Integer.parseInt(s);
    
        
    }
}