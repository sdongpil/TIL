package programmers;

/**
 * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
 *
 * 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
 * 입출력 예
 * a	b	result
 * [1,2,3,4]	[-3,-1,0,2]	3
 * [-1,0,1]	[1,0,-1]	-2
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.
 * 입출력 예 #2
 *
 * a와 b의 내적은 (-1)*1 + 0*0 + 1*(-1) = -2 입니다.
 */
public class T1203 {
    public static void main(String[] args) {
        T1203 t1203 = new T1203();
        int solution = t1203.solution(new int[]{1, 4, 6, -8}, new int[]{2, 1, 0, 1});
        System.out.println("solution = " + solution);
    }
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            num = a[i] * b[i];
            answer += num;
        }


        return answer;
    }

}
