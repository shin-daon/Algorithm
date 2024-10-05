class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        int answer = (int)numStr.indexOf(kStr);
        
        if(answer >= 0){
            answer += 1;
        }else{
            answer = -1;
        }

        return answer;
    }
}