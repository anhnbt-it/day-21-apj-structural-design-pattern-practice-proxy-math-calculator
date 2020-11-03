/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 03/11/2020
 * Time: 3:33 CH
 */

public class MathCalculatorProxy implements Calculator {

    private MathCalculator mathCalculator;

    public MathCalculatorProxy() {
        System.out.println("Unloaded");
        this.mathCalculator = new MathCalculator();
    }

    @Override
    public double add(double first, double second) throws RuntimeException {
        if (first / 2 + second / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (first / 2 + second / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.add(first, second);
    }

    @Override
    public double sub(double first, double second) throws RuntimeException {
        if (first / 2 - second / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (first / 2 - second / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.sub(first, second);
    }

    @Override
    public double mul(double first, double second) throws RuntimeException {
        double result = mathCalculator.mul(first, second);
        if (first != 0 && result / first != second) {
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double div(double first, double second) throws RuntimeException {
        if (second == 0) {
            throw new RuntimeException("Can't divide be zero!");
        }
        return mathCalculator.div(first, second);
    }
}
