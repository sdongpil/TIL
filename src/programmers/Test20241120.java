package programmers;

public class Test20241120 {
        /*
        임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
        n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.


         */
    public static void main(String[] args) {
        Test20241120 test20241120 = new Test20241120();
        Long solution = test20241120.solution(9);
        System.out.println("solution = " + solution);

    }

    public long solution(int n) {
        long answer = 0;
        double squareRoot = Math.sqrt(n);

        if (squareRoot == (long) squareRoot) {
            long num = (long) squareRoot + 1;

            answer = num * num;
        } else {
            answer = -1;
        }



        return answer;
    }

    public long solution(long n) { // n은 int 대신 long으로 처리
        long answer = 0;
        double sqrtNum = Math.sqrt(n); // n의 제곱근 계산

        if (sqrtNum == (long) sqrtNum) { // 제곱근이 정수인지 확인
            long nextNum = (long) sqrtNum + 1; // 다음 숫자 계산
            answer = nextNum * nextNum; // 다음 숫자의 제곱 계산
        } else {
            answer = -1; // 정수가 아니면 -1 반환
        }

        return answer;
    }
}
