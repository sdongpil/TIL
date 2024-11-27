package programmers;

public class Test20241113 {

    public static void main(String[] args) {
        Test20241113 test20241113 = new Test20241113();
        int solution = test20241113.solution(135);
        System.out.println("test20241113 = " + solution);

    }

    public int solution(int n) {
        int answer = 0;

        String stringNumber = String.valueOf(n);
        String[] split = stringNumber.split("");
        for (String s : split) {
            answer += Integer.parseInt(s);

        }

        return answer;
    }
}
