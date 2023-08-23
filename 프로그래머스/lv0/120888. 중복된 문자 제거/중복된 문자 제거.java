class Solution {
    public String solution(String my_string) {
        String result = "";
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.indexOf(my_string.charAt(i)) == i){
                result += my_string.charAt(i);
            }
        }
        
        return result;
    }
}