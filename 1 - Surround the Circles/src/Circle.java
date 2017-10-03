public class Circle {

    private double x, y, r;

    public Circle(double x, double y, double r) {

        setX(x);
        setY(y);
        setR(r);

        System.out.println(x + " " + y + " " + r);
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
