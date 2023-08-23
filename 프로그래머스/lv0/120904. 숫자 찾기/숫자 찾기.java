class Solution {
    public int solution(int num, int k) {
        int result = 0;
        String s = Integer.toString(num);
        String[] arr = s.split("");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(String.valueOf(k))){
                result = i+1;
                break;
            } else {
                result = -1;
            }
        }
        
        return result;
    }
}