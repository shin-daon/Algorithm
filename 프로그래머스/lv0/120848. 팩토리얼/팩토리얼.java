class Solution {
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int solution(int n) {
        int result = 0;
        
        for(int i=0; i<=10; i++){
            if(factorial(i) <= n){
                result = i;
            }
        }
        
        return result;
    }
}