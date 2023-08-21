class Solution {
    public int[] solution(int n, int[] numlist) {
        int j = 0;
        int count = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                count++;
            }
        }
        
        int[] result = new int[count];
        
         for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                result[j] = numlist[i];
                j++;
            }
        }       
        
        return result;
    }
}