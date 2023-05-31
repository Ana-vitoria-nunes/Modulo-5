package Exercicio3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Dicionario {
    public void mostrarDicionario(){
        Map<String, String> dicionario = new LinkedHashMap();
        dicionario.put("bola", "azul");
        dicionario.put("boneca", "amarelo");
        dicionario.put("dado", "rosa");
        dicionario.put("corda", "preto");
        dicionario.put("carrinho", "lilas");
        dicionario.put("amoeba", "verde");

        System.out.println("Dicionario: ");
        dicionario.forEach((k,v) -> System.out.println("Chave: " + k +" | Valor: "+ v ));
    }
}
