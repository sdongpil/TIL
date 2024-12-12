package programmers;

import java.util.Arrays;
import java.util.Locale;

/**
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 * <p>
 * 제한 사항
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 * <p>
 * 입출력 예
 * s	return
 * "try hello world"	"TrY HeLlO WoRlD"
 * 입출력 예 설명
 * "try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다. 각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다. 따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
 */
public class T1211 {
    public static void main(String[] args) {
        T1211 t1211 = new T1211();
        String solution = t1211.solution("try hello world");
        System.out.println("solution = " + solution);
    }

    public String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = s.split(" ");

        for (String string : split) {
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (i % 2 == 0) {
                    stringBuilder.append(Character.toUpperCase(c));
                } else {
                    stringBuilder.append(Character.toLowerCase(c));
                }
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public String solution2(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = s.split(" ");

        for (String string : split) {
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (i % 2 == 0) {
                    stringBuilder.append(Character.toUpperCase(c));
                } else {
                    stringBuilder.append(Character.toLowerCase(c));
                }
            }
            stringBuilder.append(" "); // 단어 사이에 공백 추가
        }

        return stringBuilder.toString().trim(); // 마지막 공백 제거
    }
}
