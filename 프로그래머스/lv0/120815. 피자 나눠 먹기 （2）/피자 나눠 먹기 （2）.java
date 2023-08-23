class Solution {
    public int solution(int n) {
        int result = 1;
        
        for(int i=1; i<=n; i++){
            if((6 * result) % n != 0){
                result++;
            }
        }
        
        return result;
    }
}