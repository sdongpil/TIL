import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 6};
        int result = solution(arr1, arr2);

        System.out.println("result = " + result);


    }

    public static int solution(int[] arr1, int[] arr2) {
        int result = 0;

        result = Integer.compare(arr1.length, arr2.length);

        if (result == 0) {
            int sum1 = IntStream.of(arr1).sum();
            int sum2 = IntStream.of(arr2).sum();
            result = Integer.compare(sum1, sum2);
        }
        return result;
    }
}