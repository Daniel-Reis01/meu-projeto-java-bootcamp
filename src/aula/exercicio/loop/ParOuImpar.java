package aula.exercicio.loop;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         int quantNumeros;

         int count = 0;

         int numero;

         int quantPares = 0, quantImpares = 0;

         System.out.println("Quantidade de números: ");
         quantNumeros = scan.nextInt();
         do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
         } while(count<quantNumeros);
         System.out.println("quantidade de pares: " + quantPares);
         System.out.println("quantidade Impar: " + quantImpares);
    }
}
