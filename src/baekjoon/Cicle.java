package baekjoon;

public class Cicle {

    public void printCircle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print("o");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();

        }
    }
}
