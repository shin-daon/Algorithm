import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        
        String[] arr = my_string.split("");
        Arrays.sort(arr);
        
        String result = String.join("", arr); // 배열의 요소들을 빈 문자열로 연결하여 문자열로 변환
        
        return result;
    }
}