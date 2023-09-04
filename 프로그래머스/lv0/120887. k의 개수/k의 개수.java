class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        String strK = String.valueOf(k);
        
        for (int n = i; n <= j; n++) {
            String value = String.valueOf(n);
            
            if (value.contains(strK)) {
                String[] arr = value.split("");
                for (String alpha : arr) {
                    if (alpha.equals(strK)) {
                        count++;
                    }
                }
            }            
        }        
        return count;
    }
}