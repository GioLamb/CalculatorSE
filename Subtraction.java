public class Subtraction {
    public static double sub(double... numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("You need to insert a minimum of two numbers");
        }

        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }

        return result;
    }
}