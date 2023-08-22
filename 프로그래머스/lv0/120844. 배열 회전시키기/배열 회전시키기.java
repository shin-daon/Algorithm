class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] result = new int[numbers.length];
        
        if(direction.equals("right")){
            for(int i=0; i<numbers.length - 1; i++){
                result[i+1] = numbers[i];
            }            
            result[0] = numbers[numbers.length - 1];
            
        } else if(direction.equals("left")){
            for(int i=0; i<numbers.length - 1; i++){
                result[i] = numbers[i+1];
            }            
            result[result.length - 1] = numbers[0];
        }
        
        return result;
    }
}