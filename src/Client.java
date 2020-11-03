/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 03/11/2020
 * Time: 3:39 CH
 */

public class Client {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        try {
            double result = proxy.add(1, 2);
            System.out.println("1 + 2 = " + result);
            result = proxy.add(2, Double.MAX_VALUE);
            System.out.println("2 + Double.MAX_VALUE = " + result); // Should throw exception
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }
}
