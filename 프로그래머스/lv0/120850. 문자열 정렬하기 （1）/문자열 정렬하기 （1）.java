import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String numbers = my_string.replaceAll("[^0-9]", "");
        int[] result = new int[numbers.length()];
        
        for(int i=0; i<numbers.length(); i++){
            result[i] = numbers.charAt(i) - '0';
        }
        
        Arrays.sort(result);
        
        return result;
    }
}