/*
Faça um algoritmo para receber
um número qualquer e imprimir na
tela se o número é par ou ímpar,
positivo ou negativo.
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IO.println("Digite um número");
        int Numb = scanner.nextInt();

        IO.println("O número " + Numb +  (Numb%2==0 ? " é PAR;" : " é IMPAR"));
        IO.println((Numb > 0 ? "Ele é positivo" : "Ele é negativo"));

    }
}
