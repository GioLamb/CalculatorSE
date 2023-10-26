public class Sum {
    public static double add(double ... numbers) {
        double sum=0;
        for (double number : numbers) {
            sum += number;
        }

        return sum;
    }
}