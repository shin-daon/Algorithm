class Solution {
    public int solution(int n) {
        if((int)Math.sqrt(n) * (int)Math.sqrt(n) == n){
            return 1;
        } else {
            return 2;
        }
    }
}