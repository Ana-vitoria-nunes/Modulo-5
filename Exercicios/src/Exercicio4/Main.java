package Exercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Contas>contas=new ArrayList<>();

        Contas contas1=new Contas(100,200,300);

        contas.add(contas1);

        for (Contas conta:contas) {
            System.out.println("Poupança com tributo: "+conta.tributoPoupanca()+"\nCorrente com tributo "+conta.tributoCorrente()+"\nSeguro de vida com tributo "+conta.tributoSeguroVida());
        }
    }
}
