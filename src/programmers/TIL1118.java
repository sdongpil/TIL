package programmers;

import java.util.ArrayList;

public class TIL1118 {
    public static void main(String[] args) {
        TIL1118 til1118 = new TIL1118();
        int[] solution = til1118.solution(1357);
        System.out.println("solution = " + solution);
    }

    public int[] solution(long n) {
        int[] answer = {};
        //12345
        String strNumber = String.valueOf(n);

        // [1,2,3,4,5]
        String[] split = strNumber.split("");
        int[] arr = new int[split.length];


        for (int i = split.length - 1, idx = 0; i >= 0; i--, idx++) {
            arr[idx] = Integer.parseInt(split[4]);
        }

        return answer;
    }
}
