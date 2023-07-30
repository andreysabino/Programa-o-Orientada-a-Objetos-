import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        Scanner ent = new Scanner (System.in);//Abrindo o Scaner

        System.out.println("Digite a quantidade de Graus a ser convertida: ");

        int graus = entrada.nextInt();

        float convers = (float) ((graus * 1.8) + 32);

        ent.close();

        System.out.printf("Em fahrenheit esse valor é: %.2F", convers);

    }
}