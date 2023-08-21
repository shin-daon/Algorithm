class Solution {
    public String solution(String rsp) {
        String result = "";
        char[] array = rsp.toCharArray();
        
        for(int i=0; i<array.length; i++){
            if(array[i] == '2'){
                result += '0';
            } else if(array[i] == '0'){
                result += '5';
            } else if(array[i] == '5'){
                result += '2';
            }
        }
        
        return result;
    }
}