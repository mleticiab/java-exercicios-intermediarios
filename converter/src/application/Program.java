package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is de dollar price? ");
        double cotacao = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dolar = sc.nextDouble();

        double resultado = CurrencyConverter.Converter(cotacao, dolar);

        System.out.printf("Amount to be paid in reais = %.2f%n", resultado);


        sc.close();
    }
}
