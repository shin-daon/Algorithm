class Solution {
    public int solution(String my_string) {
        int result = 0;
        my_string = my_string.replaceAll("[^0-9]", " ");
        
        String[] arr = my_string.split(" ");
        
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("")) {
                result += Integer.parseInt(arr[i].trim());
            }
        }
        
        return result;       
    }
}