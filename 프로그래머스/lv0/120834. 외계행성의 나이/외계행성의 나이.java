class Solution {
    public String solution(int age) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        
        while(age > 0){
            int num = age % 10;
            sb.append((char)('a'+num));
            age /= 10;
        }
        
        sb.reverse();
        
        return sb.toString();
    }
}