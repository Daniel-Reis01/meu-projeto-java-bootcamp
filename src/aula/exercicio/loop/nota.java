package aula.exercicio.loop;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int nota;
            
            System.out.print("nota: ");
            nota = scan.nextInt();
            
            while(nota < 0 | nota > 10){
                System.out.println("Nota invalida! Digite novamente ");
                nota = scan.nextInt();
            }
        }
    }
    
}
