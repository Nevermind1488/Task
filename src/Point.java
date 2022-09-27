import java.util.Locale;
import java.util.Scanner;
public class Point{
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Point p1 = readPoint("p1");
    }

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point readPoint(String pointName) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите %s.x = ", pointName);
        double x = scanner.nextDouble();
        System.out.printf("Введите %s.y = ", pointName);
        double y = scanner.nextDouble();
        return new Point(x,y);
    }
}
