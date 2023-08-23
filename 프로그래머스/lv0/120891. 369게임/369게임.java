class Solution {
    public int solution(int order) {
        int result = 0;
        String od = Integer.toString(order);
        String[] arr = od.split("");
        
        for(int i=0; i<arr.length; i++){
            if((arr[i].equals("3")) ||
               (arr[i].equals("6")) ||
               (arr[i].equals("9"))){
                result++;
            }
        }
        
        return result;
    }
}