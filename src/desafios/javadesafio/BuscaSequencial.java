package desafios.javadesafio;

import java.util.Scanner;

public class BuscaSequencial {
    private static int[] elemetos;

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero, pos = -1;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
         
         numero = leitor.nextInt();

        pos = position(numero,elementos);
        if (pos == -1){
            System.out.println("Numero" + numero + "nao encontrado!");
        } else {
            System.out.println("Achei" + numero + "na posicao");

         }
    }  

    static int position(int numero, int[] elementos){
        int pos = -1;
        for (int i = 0; i < elementos.length; i++){
            
            if(numero == elemetos[i]){
                pos = i;
            }
        }
        return pos;
    }

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    }

