package Exercicio2;

import java.math.BigDecimal;

public class Moeda {
        public static void moedaValida(String moeda) {
            switch (moeda) {
                case "Dólar americano":
                case "Dólar canadense":
                case "Euro":
                case "Libra Esterlina":
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de moeda inválido");
            }
        }

        public static BigDecimal validarValor(String valorString) {
            if (valorString.isEmpty()) {
                throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal");
            }

            BigDecimal valor = new BigDecimal(valorString);

            if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                throw new NumberFormatException("Valor inválido, por favor, tente novamente");
            }

            return valor;
        }

        public static BigDecimal converterParaReal(String moeda, BigDecimal valor) {
            BigDecimal cotacao = getCotacao(moeda);
            return valor.multiply(cotacao);
        }

        public static BigDecimal getCotacao(String moeda) {
            // Aqui você pode implementar a lógica para obter a cotação atual da moeda desejada
            // Neste exemplo, estamos retornando um valor fixo apenas para fins de demonstração

            switch (moeda) {
                case "Dólar americano":
                    return new BigDecimal("5.20");
                case "Dólar canadense":
                    return new BigDecimal("4.10");
                case "Euro":
                    return new BigDecimal("6.00");
                case "Libra Esterlina":
                    return new BigDecimal("7.50");
                default:
                    throw new IllegalArgumentException("Tipo de moeda inválido");
            }
        }
}
