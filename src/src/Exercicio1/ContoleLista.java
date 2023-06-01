package Exercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContoleLista implements Lista {

    Map<String, Double> listaVerdura = new HashMap<>();
    Map<String, Double> listaGrao = new HashMap<>();
    Map<String, Integer> listaLegumes = new HashMap<>();
    Map<String, Integer> listaOutros = new HashMap<>();
    Scanner ler = new Scanner(System.in);
    int resposta;

    @Override
    public void getmenuLista() {
        System.out.println("==== Controle de Lista de Compras ====");
        System.out.println("Selecione o tipo de alimento:");
        System.out.println("1. VERDURA");
        System.out.println("2. GRÃOS");
        System.out.println("3. LEGUMES");
        System.out.println("4. OUTROS");
        System.out.println("5. Sair");
    }

    @Override
    public void opcaoMenu() {
      while (resposta!=5){
            //getmenuLista();
            System.out.println("Qual alimento deseja adicionar:");
            int resposta = ler.nextInt();

            if (resposta==1) {
                double quantidade;
                System.out.print("Digite a quantidade em gramas: ");
                String resposta1 = ler.next();
                try {
                    quantidade = Double.parseDouble(resposta1);
                }
                catch (NumberFormatException e) {
                    throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto");
                }
                if (quantidade < 0) {
                    throw new IllegalArgumentException("Não é possível inserir números negativos");
                }

                String respsta2;
                System.out.println("Qual verdura você deseja? ");
                respsta2 = ler.next();
               /* try {
                } catch (UnsupportedOperationException e) {
                    throw new UnsupportedOperationException("Não é permitido inserir valor vazio.");
                }*/
                if (respsta2==null){
                    throw new UnsupportedOperationException("Não é permitido inserir valor vazio.");
                }
                listaVerdura.put(respsta2,quantidade);
            }
            else if (resposta==2) {
                double quantidade;
                System.out.println("Quantas gramas de grãos você deseja? ");
                String respsta3 = ler.next();
                try {
                    quantidade = Double.parseDouble(respsta3);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Para grão, a quantidade deve ser informada com ponto");
                }
                if (quantidade < 0) {
                    throw new IllegalArgumentException("Não é possível inserir números negativos");
                }
                System.out.println("Qual tipo de grão você deseja? ");
                String respsta4 = ler.next();
                listaGrao.put(respsta4, quantidade);

            }
            else if (resposta==3) {
                int quantidade;
                System.out.println("Quantas unidades de legume você deseja? ");
                String respsta5 = ler.next();
                try {
                    quantidade = Integer.parseInt(respsta5);
                }
                catch (NumberFormatException e) {
                    throw new NumberFormatException("Para legume, a quantidade deve ser informada em unidades inteiras”.");
                }
                if (quantidade < 0) {
                    throw new IllegalArgumentException("Não é possível inserir números negativos");
                }
                System.out.println("Qual legume você deseja? ");
                String respsta6 = ler.next();
                listaLegumes.put(respsta6, quantidade);

            }
            else if (resposta==4) {
                int quantidade;
                System.out.println("Quantas unidades desse produto  você deseja? ");
                String respsta7 = ler.next();
                try {
                    quantidade = Integer.parseInt(respsta7);
                }
                catch (NumberFormatException e) {
                    throw new NumberFormatException("Para outros, a quantidade deve ser informada em unidades inteiras”.");
                }
                if (quantidade < 0) {
                    throw new IllegalArgumentException("Não é possível inserir números negativos");
                }
                System.out.println("Qual PRODUTO você deseja? ");
                String respsta8 = ler.next();
                listaOutros.put(respsta8, quantidade);

            }

            else if (resposta==5) {
                listaVerdura.forEach((k, v) -> System.out.println("Chave: " + k + " | Valor: " + v));
                System.out.println("A quantidade de alimentos do tipo verdura a ser comprada é: " + listaVerdura.size());
                listaGrao.forEach((k, v) -> System.out.println("Chave: " + k + " | Valor: " + v));
                System.out.println("A quantidade de alimentos do tipo Grão a ser comprada é: " + listaGrao.size());
                listaLegumes.forEach((k, v) -> System.out.println("Chave: " + k + " | Valor: " + v));
                System.out.println("A quantidade de alimentos do tipo Legume a ser comprada é: " + listaLegumes.size());
                listaOutros.forEach((k, v) -> System.out.println("Chave: " + k + " | Valor: " + v));
                System.out.println("A quantidade de alimentos do tipo Outro a ser comprada é" + listaOutros.size());
                break;
            }
            else {
                throw new IllegalArgumentException("Tipo de alimento inválido.");

            }
        }
    }
}
