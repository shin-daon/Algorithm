import java.util.Arrays;

class Solution {
    public String solution(String rsp) {
        String[] arr = rsp.split("");
        String[] ans = new String[arr.length];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("2")){
                ans[i] = "0";
            }else if(arr[i].equals("0")){
                ans[i] = "5";
            }else if(arr[i].equals("5")){
                ans[i] = "2";
            }
        }
        
        String answer = String.join("", ans);
        
        return answer;
    }
}