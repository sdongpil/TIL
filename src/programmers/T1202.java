package programmers;

/**
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
 * solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 */
public class T1202 {
    public static void main(String[] args) {
        T1202 t1202 = new T1202();
        String solution = t1202.solution(5);
        System.out.println("solution = " + solution);
    }

    public String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(i % 2 == 0 ? "수" : "박");
        }

        return stringBuilder.toString();
    }

}
