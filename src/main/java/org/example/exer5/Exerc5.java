package org.example.exer5;

public class Exerc5 {

    public static void main(String[] args) {

        String string = "maria eduarda";
        char[] charArray = string.toCharArray();

        int i = 0;
        int j = charArray.length - 1;

        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        String invertedString = new String(charArray);
        System.out.println(invertedString);
    }
}
