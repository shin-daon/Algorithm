class Solution {
    public int solution(int[] dot) {
        int result = 0;
        
        if(dot[0] >= 0 && dot[1] >= 0){
            result = 1;
        } else if(dot[0] <= 0 && dot[1] >= 0){
            result = 2;
        } else if(dot[0] <= 0 && dot[1] <= 0){
            result = 3;
        } else {
            result = 4;
        }
        
        return result;
    }
}