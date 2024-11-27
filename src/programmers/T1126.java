package programmers;


import java.util.*;

/*
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]


 */

public class T1126 {

    public static void main(String[] args) {
        T1126 t1126 = new T1126();
        int[] solution = t1126.solution(new int[]{1, 3, 4, 6, 10}, 7);

        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
        
    }
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.size() == 0) {
            return new int[]{-1};
        }

        //오름차순 정렬
        list.sort(null);
        //list.sort(Collections.reverseOrder()); 내림차순

        int[] array = list.stream().mapToInt(s -> s).toArray();

        Arrays.sort(array);

        return array;
    }
}
