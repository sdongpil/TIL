package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon11651 {
    public void start() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y);
        }

        Arrays.sort(points);

        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }
}

class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.y == other.y) {
            return this.x - other.x;
        } else {
            return this.y - other.y;
        }
    }
}


