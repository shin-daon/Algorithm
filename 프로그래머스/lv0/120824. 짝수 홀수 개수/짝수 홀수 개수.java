class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[2];
        
        for(int i=0; i<num_list.length; i++){            
            if(num_list[i] % 2 == 0){ // 짝수일 때
                result[0]++;
            } else if(num_list[i] % 2 == 1){ // 홀수일 때
                result[1]++;
            }            
        }
        
        return result;
    }
}