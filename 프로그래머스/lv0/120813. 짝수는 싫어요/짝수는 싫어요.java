class Solution {
    public int[] solution(int n) {
        int[] result;
        int j = 0;
        
        if(n % 2 == 0){
            result = new int[n / 2];
        } else {
            result = new int[n / 2 + 1];
        }
        
        for(int i=0; i<=n; i++){
            if(i % 2 == 1){ // 홀수인 i만 걸러내기
                result[j] = i;
                j++;
            }
        }
        
        return result;
    }
}