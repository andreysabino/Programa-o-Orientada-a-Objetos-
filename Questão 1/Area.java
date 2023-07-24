import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ValorUm = 0;

        System.out.println("Digite o valor do lado do quadrado:");
        ValorUm = entrada.nextInt();
        
        entrada.close();
        
        System.out.printf("O valor da área é : " + ValorUm * ValorUm + "\n");

        
    }
}
