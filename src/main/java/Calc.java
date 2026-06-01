public class Calc {


    int getSum(int a, int b) {
        return a + b;
    }

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

      public int getSumSum(int i, int i1, int i2) {
        return i + i1 + i2;
    }
}
