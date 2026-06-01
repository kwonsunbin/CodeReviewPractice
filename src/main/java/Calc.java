public class Calc {

    public int getGop(int a, int b) {
        return a * b;
    }

    public int getZegop(int a) {
        return a * a;
    }

    public int getMinus(int a, int b) {
        return a - b;
    }

    public double getDevide(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }
}
