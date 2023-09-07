import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] result = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if (emergency[i] < emergency[j]) {
                    result[i]++;
                }
            }
            
            result[i]++;
        }
        
        return result;
    }
}