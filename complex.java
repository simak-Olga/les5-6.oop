public class Complex {
    private double number1;
    private double number2;
    public Complex(double number1, double number2) {
        x = number1;
        y = number2;
    }
    public double getRe() {
        return x;
    }
    public double getIm() {
        return y;
    }
    public double abs() {
        return Math.sqrt(x*x + y*y);
    }
    public Complex getReciprocal() {
        double denominator = (x*x + y*y);
        if (denominator != 0) {
            return new Complex(x/denominator, -y/denominator);
        } else {
            throw new IllegalStateException("z = 0");
        }
    }
    @Override
    public String toString() {
        return "x = " + x1 + ", y = " + y1;
    }
}