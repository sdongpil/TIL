package programmers;

public class Test20241112 {

    public static void main(String[] args) {
        Test20241112 test20241112 = new Test20241112();
        int[] arr = {1, 2, 5};
        double solution = test20241112.solution(arr);

        System.out.println("solution = " + solution);
    }
    public double solution(int[] arr) {
        double answer = 0;

        for (int number : arr) {
            answer += number;
        }

        return answer / arr.length;
    }
}
