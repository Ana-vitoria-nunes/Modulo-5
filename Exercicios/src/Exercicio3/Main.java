package Exercicio3;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> dicionario = new LinkedHashMap();
        dicionario.put("bola", "azul");
        dicionario.put("boneca", "amarelo");
        dicionario.put("dado", "rosa");
        dicionario.put("corda", "preto");
        dicionario.put("carrinho", "lilas");
        dicionario.put("amoeba", "verde");
        Iterator var2 = dicionario.entrySet().iterator();

        while(var2.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry)var2.next();
            PrintStream var10000 = System.out;
            String var10001 = (String)entry.getKey();
            var10000.println("Chave:" + var10001 + " Valor:" + (String)entry.getValue());
            System.out.println("-----------------------------------------------------");
        }

    }
}
