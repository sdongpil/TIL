package programmers;

/**
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 *
 * 제한 사항
 * 두 수는 1이상 1000000이하의 자연수입니다.
 * 입출력 예
 * n	m	return
 * 3	12	[3, 12]
 * 2	5	[1, 10]
 * 입출력 예 설명
 * 입출력 예 #1
 * 위의 설명과 같습니다.
 *
 * 입출력 예 #2
 * 자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
 */
public class T1210 {
    public static void main(String[] args) {
        T1210 t1210 = new T1210();
        int[] solution = t1210.solution(3, 9);
        System.out.println("solution = " + solution);
    }

    public int[] solution(int n, int m) {
        int gcd = 1;


         // 3 10
        // 최대공약수 구하기
        for(int i = 1; i <= n && i <= m; i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        // 최소공배수 = 두 수의 곱 / 최대공약수
        int lcm = (n * m) / gcd;

        return new int[]{gcd, lcm};
    }
}
