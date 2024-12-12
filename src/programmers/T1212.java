package programmers;

import java.util.Arrays;

/**
 * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
 * 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
 */
public class T1212 {
    public static void main(String[] args) {
        T1212 t1212 = new T1212();
        String solution = t1212.solution("-1 -2 -4");
        System.out.println("solution = " + solution);

    }
    public String solution(String s) {
        String answer = " ";

        String[] split = s.split(" ");
        int[] intArr = Arrays.stream(split)
                .mapToInt(num -> Integer.parseInt(num))
                .sorted()
                .toArray();

        answer = intArr[0] + " " + intArr[intArr.length - 1];

        return answer;
    }
}
