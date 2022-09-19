import java.util.Locale;
import java.util.Scanner;
public class Task1 {
    public static double getS(double r, double R){
    double a = Math.PI * r * r * 0.125 * 6;
    double b = Math.PI * r * r;
    double e = 2 * R;
    double d = Math.pow(e, 2);
    double f = (d - b) / 8;
    return a + f;
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус r:");
        double r = scanner.nextDouble();
        System.out.print("Введите радиус R:");
        double R = scanner.nextDouble();
        System.out.print(getS(r,R));
    }
}