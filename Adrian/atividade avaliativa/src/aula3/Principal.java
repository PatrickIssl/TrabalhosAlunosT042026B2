package aula3;

import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        
        int numeroAleatorio = rd.nextInt(11); // número de 0 a 10
        boolean acertou = false;

        System.out.println("Tente adivinhar o número entre 0 e 10!");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int valor = scan.nextInt();

            if (valor > numeroAleatorio) {
                System.out.println("O valor é menor...");
            } 
            else if (valor < numeroAleatorio) {
                System.out.println("O valor é maior...");
            } 
            else {
                System.out.println("Você ganhou!");
                acertou = true;
            }
        }

        scan.close();
    }
}