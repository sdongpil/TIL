package baekjoon;

public class Point implements Comparable<baekjoon.Point>{
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(baekjoon.Point other) {
            if (this.y == other.y) {
                return this.x - other.x;
            } else {
                return this.y - other.y;
            }
        }

}
