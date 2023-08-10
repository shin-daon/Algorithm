class Solution {
    public int solution(int slice, int n) {
        double result = (double)n / (double)slice;
            
        return (int)Math.ceil(result);
    }
}