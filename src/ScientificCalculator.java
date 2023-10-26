import java.lang.Math;

public class ScientificCalculator {
    public double sin(double x) {
        return Math.sin(x);
    }

    public double cos(double x) {
        return Math.cos(x);
    }

    public double tan(double x) {
        return Math.tan(x);
    }

    public double cot(double x) {
        return 1.0 / Math.tan(x);
    }

    public double arcsin(double x) {
        return Math.asin(x);
    }

    public double arccos(double x) {
        return Math.acos(x);
    }

    public double arctan(double x) {
        return Math.atan(x);
    }

    public double arccot(double x) {
        return Math.PI / 2.0 - Math.atan(x);
    }

    public double sqrt(double x) {
        return Math.sqrt(x);
    }

    public double log(double x) {
        return Math.log(x);
    }

    public double log10(double x) {
        return Math.log10(x);
    }

    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double exp(double x) {
        return Math.exp(x);
    }
}