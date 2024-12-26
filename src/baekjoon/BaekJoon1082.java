package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 스타트링크가 입주한 사무실은 방 번호를 직접 정할 수 있다. 방 번호를 정하려면 1층 문방구에서 파는 숫자를 구매해야 한다. 숫자를 구매하기 위해 준비한 금액은 M원이다.
 * <p>
 * 문방구에서 파는 숫자는 0부터 N-1까지이고, 각 숫자 i의 가격은 Pi이다. 문방구에서는 같은 숫자를 여러 개 구매할 수 있고, 문방구는 매우 많은 재고를 보유하고 있기 때문에,
 * 항상 원하는 만큼 숫자를 구매할 수 있다. 방 번호가 0이 아니라면 0으로 시작할 수 없다.
 * <p>
 * 예를 들어, N = 3, M = 21, P0 = 6, P1 = 7, P2 = 8이라면, 만들 수 있는 가장 큰 방 번호는 210이다. 최대 M원을 사용해서 만들 수 있는 가장 큰 방 번호를 구해보자.
 */
public class BaekJoon1082 {
    static int N, M;
    static int[] P;
    static String answer = "0";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        N = sc.nextInt();
        P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        M = sc.nextInt();

        // 첫 자리수가 0이 아닌 경우부터 시작
        for (int i = 1; i < N; i++) {
            if (P[i] <= M) {
                dfs(String.valueOf(i), M - P[i]);
            }
        }

        System.out.println(answer);
    }

    // DFS로 가능한 모든 숫자 조합 확인
    private static void dfs(String current, int remainMoney) {
        // 현재 만든 숫자가 이전 답보다 크면 정답 갱신
        if (current.length() > answer.length() || (current.length() == answer.length() && current.compareTo(answer) > 0)) {
            answer = current;
        }

        // 남은 돈으로 추가 숫자를 붙일 수 있는지 확인
        for (int i = 0; i < N; i++) {
            if (remainMoney >= P[i]) {
                dfs(current + i, remainMoney - P[i]);
            }
        }
    }

}
