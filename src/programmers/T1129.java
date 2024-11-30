package programmers;

import java.util.HashSet;
import java.util.Set;

/**
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 * [5,8,4,0,6,7,9]
 */
public class T1129 {
    public static void main(String[] args) {
        T1129 t1129 = new T1129();
        int solution = t1129.solution(new int[]{1,3,4,5,6,7});
        System.out.println("solution = " + solution);
    }

    //[5,8,4,0,6,7,9]
    public int solution(int[] numbers) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            set.add(i);
        }

        for (int number : numbers) {
            set.remove(number);
        }


        for (Integer number : set) {
            answer += number;
        }

        return answer;
    }
}
