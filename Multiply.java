public class Multiply {
    public static double multiply(double ... numeri) {
        int prodotto = 1;

        for (double numero : numeri) {
            prodotto *= numero;
        }

        return prodotto;
    }
}