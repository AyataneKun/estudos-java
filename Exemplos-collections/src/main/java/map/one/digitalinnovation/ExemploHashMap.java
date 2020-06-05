package map.one.digitalinnovation;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap { // Exemplo de HashMap

    public static void main(String[] args) {

        Map<String, String> estados = new HashMap<>(); //Instância de um HashMap do tipo String,String

        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("AC", "Acre");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("PA", "Pará");
        estados.put("MA", "Maranhão");
        estados.put("PI", "Piauí");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("SE", "Sergipe");
        estados.put("PE", "Pernambuco");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("PB", "Paraíba");
        estados.put("TO", "Tocantins");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("GO", "Goiás");
        estados.put("MG", "Minas Gerais");
        estados.put("ES", "Espirito Santo");
        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("PR", "Paraná");
        estados.put("SC", "Santa Catarina");
        estados.put("RS", "Rio Grande do Sul"); //adição dos elementos, com sua chave e valor.

        estados.remove("MG"); //Remoção de um elemento do Map através de sua chave.

        estados.put("DF", "Distrito Federal"); // Adição de um novo elemento ao Map.

        System.out.println(estados.size()); // Tamanho do Map.

        estados.values().remove("Mato Grosso do Sul"); // Remoção de um elemento do Map através do seu valor.

        for (Map.Entry<String, String> entry : estados.entrySet()) {
            System.out.println(entry.getValue() + " (" + entry.getKey() + ")"); // Varredura do Map, imprimindo os valores no formato NOME (SIGLA).
        }

        System.out.println(estados.containsKey("SC")); // Verificação se o estado Santa Catarina existe pela chave.

        System.out.println(estados.containsValue("Maranhão")); // Verificação se o estado Maranhão existe pelo valor.
    }
}
