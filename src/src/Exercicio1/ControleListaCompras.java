package Exercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControleListaCompras implements Lista {
    Map<String, Double> listaVerdura = new HashMap<>();
    Map<String, Double> listaGrao = new HashMap<>();
    Map<String, Integer> listaLegumes = new HashMap<>();
    Map<String, Integer> listaOutros = new HashMap<>();
    Scanner ler = new Scanner(System.in);

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

    int resposta;
    int V = 0;
    int G = 0;
    int L = 0;
    int O = 0;
    String resposta1;
    double quantidade;


    @Override
    public void opcaoMenu() {
        while (resposta != 5) {
                getmenuLista();
                System.out.println("Qual alimento deseja adicionar:");
                int resposta = ler.nextInt();
                switch (resposta) {
                    case 1:
                        System.out.print("Digite a quantidade em gramas: ");
                        double resposta1 = ler.nextDouble();
                        System.out.println("Qual verdura você deseja? ");
                        String respsta2 = ler.next();
                        V++;
                        listaVerdura.put(respsta2, resposta1);
                        break;
                    case 2:
                        System.out.println("Quantas gramas de grãos você deseja? ");
                        double respsta3 = ler.nextDouble();
                        System.out.println("Qual tipo de grão você deseja? ");
                        String respsta4 = ler.next();
                        listaGrao.put(respsta4, respsta3);
                        G++;
                        break;
                    case 3:
                        System.out.println("Quantas unidades de legume você deseja? ");
                        Integer respsta5 = ler.nextInt();
                        System.out.println("Qual legume você deseja? ");
                        String respsta6 = ler.next();
                        listaLegumes.put(respsta6, respsta5);
                        L++;
                        break;
                    case 4:
                        System.out.println("Quantas unidades desse produto  você deseja? ");
                        int respsta7 = ler.nextInt();
                        System.out.println("Qual PRODUTO você deseja? ");
                        String respsta8 = ler.next();
                        listaOutros.put(respsta8, respsta7);
                        O++;
                        break;
                    case 5:
                        listaVerdura.forEach((k, v) -> System.out.println("Chave: " + k + " | Valor: " + v));
                        System.out.println("A quantidade de alimentos do tipo verdura a ser comprada é: " + V);
                        listaGrao.forEach((k, v) -> System.out.println("Chave: " + k + " | Valor: " + v));
                        System.out.println("A quantidade de alimentos do tipo Grão a ser comprada é: " + G);
                        listaLegumes.forEach((k, v) -> System.out.println("Chave: " + k + " | Valor: " + v));
                        System.out.println("A quantidade de alimentos do tipo Legume a ser comprada é: " + L);
                        listaOutros.forEach((k, v) -> System.out.println("Chave: " + k + " | Valor: " + v));
                        System.out.println("A quantidade de alimentos do tipo Outro a ser comprada é" + O);
                        break;
                    default:
                        throw new IllegalArgumentException("“Tipo de alimento inválido.");

                }
            }
        }
    }