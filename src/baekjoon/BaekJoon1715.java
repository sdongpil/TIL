package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 정렬된 두 묶음의 숫자 카드가 있다고 하자. 각 묶음의 카드의 수를 A, B라 하면 보통 두 묶음을 합쳐서 하나로 만드는 데에는 A+B 번의 비교를 해야 한다. 이를테면, 20장의 숫자 카드 묶음과 30장의 숫자 카드 묶음을 합치려면 50번의 비교가 필요하다.
 * <p>
 * 매우 많은 숫자 카드 묶음이 책상 위에 놓여 있다. 이들을 두 묶음씩 골라 서로 합쳐나간다면, 고르는 순서에 따라서 비교 횟수가 매우 달라진다.
 * 예를 들어 10장, 20장, 40장의 묶음이 있다면 10장과 20장을 합친 뒤, 합친 30장 묶음과 40장을 합친다면 (10 + 20) + (30 + 40) = 100번의 비교가 필요하다.
 * 그러나 10장과 40장을 합친 뒤, 합친 50장 묶음과 20장을 합친다면 (10 + 40) + (50 + 20) = 120 번의 비교가 필요하므로 덜 효율적인 방법이다.
 * <p>
 * N개의 숫자 카드 묶음의 각각의 크기가 주어질 때, 최소한 몇 번의 비교가 필요한지를 구하는 프로그램을 작성하시오.
 */
public class BaekJoon1715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orderQuantity = scanner.nextInt();

        int[] intArr = new int[orderQuantity];
        for (int i = 0; i < orderQuantity; i++) {
            intArr[i] = scanner.nextInt();
        }

        int solution = solution(intArr);
        System.out.println(solution);

    }

    public static int solution(int[] intArr) {
        Arrays.sort(intArr);
        // 30
        int firstSum = intArr[0] + intArr[1];

        int lastSum = 0;
        for (int i = 0; i < intArr.length -2; i++) {
            lastSum = firstSum + intArr[i + 2];
        }

        return firstSum + lastSum;
    }
}