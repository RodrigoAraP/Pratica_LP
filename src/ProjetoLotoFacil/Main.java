package ProjetoLotoFacil;

import java.io.IOException;

class Main {
    public static void main(String[] args) {
        System.out.print("Digite um caractere: ");

        try {
            char caractere = (char) System.in.read();
            System.in.skip(1); // Pular a quebra de linha ou qualquer caractere extra após o caractere digitado
            System.out.println("Você digitou o caractere: " + caractere);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}