package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제
 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
 * <p>
 * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
 * <p>
 * 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
 */
public class BaekJoon11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);  // 10
        int money = Integer.parseInt(input[1]);  // 4200

        int[] ints = new int[count];
        for (int i = 0; i < count; i++) {
            ints[i] = Integer.parseInt(br.readLine());
        }

        int solution = solution(ints, money);
        System.out.println(solution);


    }

    private static int solution(int[] ints, int money) {
        int count = 0;

        Arrays.sort(ints);

        for (int i = ints.length-1; i >= 0; i--) {
            while (money >= ints[i]) {
                money -= ints[i];
                count++;
            }
        }
        return count;
    }
}
