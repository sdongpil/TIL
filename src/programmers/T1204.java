package programmers;

/**
 * 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class T1204 {
    public static void main(String[] args) {
        T1204 t1204 = new T1204();
        int solution = t1204.solution(24, 27);
        System.out.println("solution = " + solution);
    }

    public int solution(int left, int right) {
        int count = 0;
        int answer = 0;

        for (int j = left; j <= right; j++) {
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                answer += j;
            } else {
                answer -= j;
            }
            count = 0;

        }
        return answer;
    }
}
