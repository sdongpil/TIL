package programmers;

import java.util.Arrays;
import java.util.Collections;

public class T1121 {
    public static void main(String[] args) {
        T1121 t1121 = new T1121();
        long solution = t1121.solution(4251256);
        System.out.println("solution = " + solution);
    }

    public long solution(long n) {
        String strNum = String.valueOf(n);

        String[] split = strNum.split("");

        Arrays.sort(split, Collections.reverseOrder());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            stringBuilder.append(split[i]);
        }

        return Long.parseLong(stringBuilder.toString());
    }
}
