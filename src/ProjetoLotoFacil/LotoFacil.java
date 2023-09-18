package ProjetoLotoFacil;

import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class LotoFacil {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int menu = -1;

        do {
            System.out.println("*************************\nMenu LOTOFÁCIL\n[1] Aposta 0-100\n[2] Aposta A-Z\n[3]Aposta Par ou Impar\n[0] Sair\n*************************");
            menu = input.nextInt();

            if (menu == 1){
                int sorteio = random.nextInt(100);
                System.out.print("Aposta: ");
                int aposta = input.nextInt();
                if (aposta == sorteio)
                    System.out.println("Você ganhou R$ 1.000,00!");
                else
                    System.out.println("Que pena! O número sorteado foi: " + sorteio);
            }

            else if (menu == 2){
                char acerto = 'R';
                System.out.print("Aposta: ");
                char sorteio = (char) System.in.read();
                sorteio = Character.toUpperCase(sorteio);
                if (Character.isLetter(sorteio)){
                    if (sorteio == acerto)
                        System.out.println("Você ganhou R$ 500,00.");
                    else
                        System.out.println("Que pena! A letra sorteada foi: " + acerto);
                }
                else
                    System.out.println("Aposta inválida");

            }

            else if (menu == 3){
                System.out.print("Aposta: ");
                int aposta = input.nextInt();
                if (aposta % 2 == 0)
                    System.out.println("Você ganhou R$ 100,00!");
                else
                    System.out.println("Que pena!O número digitado é ímpar e a premiação foi para números pares.");
            }

            else if (menu != 0) {
                System.out.println("Opção invalida.");
            }

        }while (menu != 0);
        System.out.println("*** FIM! ***");
    }
}
