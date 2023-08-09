import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers); // 배열 오름차순 정렬
        
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
    }
}