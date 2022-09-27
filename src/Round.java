public class Round {
    public double x0;
    public double y0;
    public double x;
    public double y;
    public double r;

    public Round(double x0, double y0) {
        this.x0 = x0;
        this.y0 = y0;
        r = Math.sqrt(Math.pow(x-x0, 2) + Math.pow(y-y0, 2));
    }
    public boolean isPointOutsideOfRound(double x, double y){
        return x > Math.sqrt(Math.pow(x-x0, 2) + Math.pow(y-y0, 2));
    }
    public boolean isPointInsideOfRound(double x, double y){
        return x < Math.sqrt(Math.pow(x-x0, 2) + Math.pow(y-y0, 2));
    }
}
