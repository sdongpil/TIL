package programmers;

import java.util.Arrays;

public class T1122 {

    public static void main(String[] args) {
        T1122 t1122 = new T1122();
        boolean solution = t1122.solution(12);
        System.out.println("solution = " + solution);

    }
    public boolean solution(int x) {
        boolean answer = true;
        String strNum = String.valueOf(x);
        int total = 0;

        // [1,4]
        String[] split = strNum.split("");

        for (int i = 0; i < split.length; i++) {
            total += Integer.parseInt(split[i]);
        }
        answer = x % total == 0;

        return answer;
    }
}
