package org.example.Exer3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Exer3 {

    private static String PATH_DADOS = "src/main/java/org/example/Exer3/dados.json";

    public static void main(String[] args) throws IOException {


        ObjectMapper mapper = new ObjectMapper();

        File file = new File(PATH_DADOS);
        List<Dados> dados = mapper.readValue(file, new TypeReference<List<Dados>>() {
        });

        var min = dados.stream().filter(d -> !d.getValor().equals(0.0))
                .mapToDouble(Dados::getValor)
                .min().getAsDouble();


        var max = dados.stream()
                .mapToDouble(Dados::getValor)
                .max().getAsDouble();


        var media = dados.stream()
                .mapToDouble(Dados::getValor)
                .average()
                .getAsDouble();

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês: " + min);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: " + max);
        System.out.print("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: ");
        dados.stream().filter(d -> d.getValor() > media).forEach(d -> System.out.print(d.getDia() + ", "));
    }


}

