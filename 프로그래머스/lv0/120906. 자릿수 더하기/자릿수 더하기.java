class Solution {
    public int solution(int n) {
        int result = 0;
        String number = String.valueOf(n);
        
        char[] numbers = number.toCharArray();
        for(int i=0; i<numbers.length; i++){
            result += numbers[i] - '0';
        }
                
        return result;
    }
}