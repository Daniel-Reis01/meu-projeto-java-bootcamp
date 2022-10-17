package desafios.javadesafio;

import java.util.Scanner;

public class somandoMultiplos {
    public static void main(String[] args) {
        
        int A, N;
        
        int soma = 0;
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("retunA:");
         A = input.nextInt();
        
         System.out.println("retunB:");
         N = input.nextInt();
        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        for(int i = 1 ; i <= N ; i++){
                 
                  if(i % A == 0) {
                    
                soma += i;
                 
        } 
    }
    System.out.println(soma);
    //o resultado fora do escopo mostra o ultimo resultado
    //se colocar em cima do aspas ele mostra cada resultado um por um ate finalizar
 }  
}
