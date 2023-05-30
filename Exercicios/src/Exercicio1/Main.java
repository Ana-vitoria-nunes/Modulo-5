package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(5);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(8);
        numeros.add(8);

        System.out.println(numeros);
    }
}