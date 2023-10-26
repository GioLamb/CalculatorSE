public class Division {

    public static double divide(double... numbers) throws ArithmeticException {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("You need to insert a minimum of two numbers.");
        }

        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new ArithmeticException("Impossible divide for zero.");
            }
            result /= numbers[i];
        }
        return result;
    }
}