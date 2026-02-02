package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double Converter(double dolar, double cotacao) {
        return dolar * cotacao * (1 + IOF);
    }
}