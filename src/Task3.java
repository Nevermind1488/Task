import java.util.Locale;
import java.awt.Point;

public class Task3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Point p = new Point();
    }

    public static class Point {
        public double x, y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}