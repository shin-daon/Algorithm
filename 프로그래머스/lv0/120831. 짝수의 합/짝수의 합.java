class Solution {
    public int solution(int n) {
        int result = 0;
        
        for(int i=0; i<n+1; i=i+2){
            result += i;
        }
                
        return result;
    }
}