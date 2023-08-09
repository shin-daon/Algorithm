class Solution {
    public int solution(int n, int k) {
        
        int result  = (n*12000) + ((k-(n/10))*2000);
        
        return result;
    }
}