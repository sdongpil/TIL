import baekjoon.Cicle;
import programmers.Test4;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"12", "1234", "145"};
        String[] arr2 = {"12", "34", "145"};

        Test4 test4 = new Test4();

        boolean solution = test4.solution(arr2);
        System.out.println(solution);
    }

}