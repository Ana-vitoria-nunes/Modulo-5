package Exercicio2;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda=new ConversorMoeda();
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println("Boas vindas ao conversor de moedas");
    }
}
