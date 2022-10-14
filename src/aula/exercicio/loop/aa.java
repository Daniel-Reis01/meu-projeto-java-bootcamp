package aula.exercicio.loop;

public class aa {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);

    }
}
