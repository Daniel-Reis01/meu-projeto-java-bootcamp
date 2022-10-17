package desafios.javadesafio;

import java.util.Scanner;

public class osNumerosSaoIguais {
    // IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.



    public static void main(String[] args) {
      
        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        Scanner scan = new Scanner(System.in);
        
    
        

        int valorA ;
        int valorB ;
        
        System.out.println("numero A");
        valorA = scan.nextInt();
        System.out.println("numero B");
        valorB= scan.nextInt();
        
        if (valorA == valorB)
        
        System.out.println("Sao iguais!");
        
        
       else 
        
        System.out.println("Nao Sao iguais!");
      

    }
}
    

