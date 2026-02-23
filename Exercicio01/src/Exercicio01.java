import java.util.Scanner;
/*
1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
*/

public class Exercicio01 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      IO.println("Digite o valor de A");
      int a = scanner.nextInt();
      IO.println("Digite o valor de B");
      int b = scanner.nextInt();
      IO.println("Digite o valor de C");
      int c = scanner.nextInt();

      int soma = a+b;

      IO.println("A soma de A+B é:" +soma);

      if(soma < c){
        IO.println("A soma de A+B é Menor que C" );
      }
      else{
        IO.println("A soma de A+B é Maior que C" );

      }

    }
}