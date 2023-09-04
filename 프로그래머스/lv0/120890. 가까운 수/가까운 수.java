import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int result = 0;
        int num = n + 100;
        
        for (int i = 0; i < array.length; i++) {
          if (Math.abs(array[i] - n) < num) {
            num = Math.abs(array[i] - n);
            result = i;
          }
        }
        
        return array[result];
    }
}