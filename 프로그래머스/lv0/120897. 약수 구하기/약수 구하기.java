class Solution {
    public int[] solution(int n) {
        int index = 0;
        int j = 0;
        
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                index++;
            }
        }
        
        int[] result = new int[index];
        
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                result[j] = i;
                j++;
            }
        }
        
        return result;
    }
}