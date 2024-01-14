class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        String str = null;
        
        for(int i=0; i<strlist.length; i++){
            str = strlist[i];
            answer[i] = str.length();
        }
        
        return answer;
    }
}