class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("");
        String[] arr = {"a", "e", "i", "o", "u"};
        
        for(int i=0; i<str.length; i++){
            for(int j=0; j<arr.length; j++){
                if(str[i].equals(arr[j])){
                    str[i] = "";
                }
            }
        }
        
        String answer = String.join("", str);
        
        return answer;
    }
}