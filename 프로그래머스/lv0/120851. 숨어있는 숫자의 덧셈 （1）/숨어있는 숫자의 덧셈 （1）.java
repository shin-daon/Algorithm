class Solution {
    public int solution(String my_string) {
        int result = 0;
        my_string = my_string.replaceAll("[^0-9]", ""); // 0-9 숫자가 아닌 모든 문자
        String[] arr = my_string.split("");
                
        for (int i = 0; i < arr.length; i++) {
			result += Integer.valueOf(arr[i]); 
		}
        return result;
    }
}