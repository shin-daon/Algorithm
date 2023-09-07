class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int result = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("Z")){
                result -= Integer.parseInt(arr[i-1]);
                continue;
            }
            
            result += Integer.parseInt(arr[i]);
        }
        
        return result;
    }
}