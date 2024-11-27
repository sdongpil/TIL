package programmers;

import java.sql.Array;

public class T1125 {
    public static void main(String[] args) {
        String[] arrStr = {"String", "kim", "Kim2"};

        T1125 t1125 = new T1125();
        String solution = t1125.solution(arrStr);
        System.out.println("solution = " + solution);
    }
    public String solution(String[] seoul) {
        int index = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
            }
        }

        return "김서방은 " + index +"에 있다";
    }
}
