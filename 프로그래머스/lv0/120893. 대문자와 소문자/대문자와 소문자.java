class Solution {
    public String solution(String my_string) {
        
        String result = "";
        char[] array = my_string.toCharArray();
        
        for(int i=0; i<array.length; i++){
            if(Character.isUpperCase(array[i])){
                array[i] = Character.toLowerCase(array[i]);
            } else if(Character.isLowerCase(array[i])){
                array[i] = Character.toUpperCase(array[i]);
            }
            
            result += array[i];
        }
        
        return result;
    }
}