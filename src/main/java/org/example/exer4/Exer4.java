package org.example.exer4;

public class Exer4 {

    public static void main(String[] args) {

        Double sp = 67836.43;
        Double rj = 36678.66;
        Double mg = 29229.88;
        Double es = 27165.48;
        Double outros = 19849.53;

        var soma = sp + rj + mg + es + outros;

        var porcSp = (sp / soma) * 100;
        var porcRj = (rj / soma) * 100;
        var porcMg = (mg / soma) * 100;
        var porcEs = (es / soma) * 100;
        var porcOutros = (outros / soma) * 100;

        System.out.println("Sao Paulo: " + porcSp);
        System.out.println( "Rio de Janeiro: " + porcRj);
        System.out.println("Minas Gerais: " + porcMg);
        System.out.println("Espirito Santo: " + porcEs);
        System.out.println( "Outros: " + porcOutros);



    }
}
