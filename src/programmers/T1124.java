package programmers;

import java.util.logging.Logger;

/*
예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요. 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.

 */
public class T1124 {
    public static void main(String[] args) {
        T1124 t1124 = new T1124();
        int solution = t1124.solution(626331);
        System.out.println("solution = " + solution);
    }

    public int solution(int num) {
        int count = 0;

        long n = num;
        if (n == 1) {
            return 0;
        }

        while (n != 1) {

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }

            count++;

            if (count > 500) {
                return -1;
            }

        }
        return count;
    }
}
