package programmers;

/**
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 */
public class T1201 {

    public static void main(String[] args) {
        T1201 t1201 = new T1201();
        String solution = t1201.solution("123456789");
        System.out.println("solution = " + solution);
    }

    public String solution(String s) {
        int length = s.length();
        int middle = length / 2;

        if (length % 2 != 0) {
            char c = s.charAt(middle);
            return String.valueOf(c);
        } else {
            return s.substring(middle - 1, middle + 1);
        }
    }

}
