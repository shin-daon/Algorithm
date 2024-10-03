import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int index = 0;
        int[] answer = new int[n]; // 최대 약수 개수는 n개이므로 n 크기의 배열 생성

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index++] = i;
            }
        }

        // 실제 사용된 약수의 개수만큼 잘라서 반환
        return Arrays.copyOfRange(answer, 0, index);
    }
}