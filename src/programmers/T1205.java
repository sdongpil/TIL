package programmers;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 */
public class T1205 {
    public static void main(String[] args) {
        T1205 t1205 = new T1205();
        String solution = t1205.solution("daZb");
        System.out.println("solution = " + solution);
    }

    public String solution(String s) {
        String[] split = s.split("");
        StringBuilder answer = new StringBuilder();

        Arrays.sort(split, Comparator.reverseOrder());
        for (String s1 : split) {
            answer.append(s1);
        }

        return answer.toString();
    }
}
