package Exercicio2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorMoeda  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println("Boas vindas ao conversor de moedas");

        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite a moeda que você deseja converter (Dólar americano, Dólar canadense, Euro, Libra Esterlina): ");
            String moeda = scanner.nextLine();

            try {
                Moeda.moedaValida(moeda); // Verifica se a moeda é válida

                System.out.println("O programa só converte para Real (R$)");

                System.out.print("Digite o valor a ser convertido: ");
                String valorString = scanner.nextLine();

                BigDecimal valor = Moeda.validarValor(valorString); // Valida o valor informado

                BigDecimal valorConvertido = Moeda.converterParaReal(moeda, valor); // Realiza a conversão para Real

                System.out.println("A " + moeda + " na cotação de hoje está em " + Moeda.getCotacao(moeda) +
                        ", o valor que pediu para converter de " + decimalFormat.format(valor) +
                        " em reais é R$" + decimalFormat.format(valorConvertido));

                System.out.print("Deseja fazer outra conversão? (S/N): ");
                String opcao = scanner.nextLine();

                if (opcao.equalsIgnoreCase("N")) {
                    continuar = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Para moeda, o valor monetário deve ser um número decimal");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Encerrando o programa de conversão de moedas");
    }
}


