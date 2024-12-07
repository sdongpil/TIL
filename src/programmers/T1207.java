package programmers;

/**
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 */
public class T1207 {
    public static void main(String[] args) {
        T1207 t1207 = new T1207();
        boolean solution = t1207.solution("123414");
        System.out.println("solution = " + solution);

    }

    public boolean solution(String s) {
        boolean answer = true;

        int length = s.length();

        if (length != 4 && length != 6) {
            answer = false;
        }

        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }

        return answer;
    }
}
