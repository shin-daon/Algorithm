class Solution {
    public int solution(int n) {
        int result = 0;
        int count;
        
        for(int i=1; i<=n; i++){
            count = 0;
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count >= 3){
                result++;
            }
        }
        
        return result;
    }
}