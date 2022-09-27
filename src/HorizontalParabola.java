public class HorizontalParabola {
    public double x0;
    public double y0;
    public double a;
    public double x;
    public double y;

    public HorizontalParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
        x = a * Math.pow(y - y0, 2) + x0;
    }

    public boolean isPointOutsideOfParabola(double x, double y) {
        return x > a * Math.pow(y - y0, 2) + x0;
    }

    public boolean isPointInsideOfParabola(double x, double y) {
        return x < a * Math.pow(y - y0, 2) + x0;
    }
}