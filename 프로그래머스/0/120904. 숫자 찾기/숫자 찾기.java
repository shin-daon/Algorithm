class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = String.valueOf(num);
        String[] arr = str.split("");
        String key = String.valueOf(k);
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(key)){
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}