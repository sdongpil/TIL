package baekjoon;

public class BaekJoon2444 {
//별찍기
    public void start() {

        int num = 5;
        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
