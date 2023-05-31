package Exercicio2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Set<Integer> numero = new HashSet();
        numero.add(1);
        numero.add(5);
        numero.add(5);
        numero.add(6);
        numero.add(7);
        numero.add(8);
        numero.add(8);
        numero.add(8);
        System.out.println(numero);

        //representa uma coleção que não permite elementos duplicados.
    }
}
