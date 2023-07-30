import java.util.Scanner;

public class CDU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o número de 3 dígitos no formato CDU
        System.out.println("Digite um número de 3 dígitos no formato CDU: ");
        int numeroCDU = scanner.nextInt();

        // Armazena cada dígito em uma variável de tipo inteiro
        int centena = numeroCDU / 100;  // Obtém o dígito da centena
        int dezena = (numeroCDU / 10) % 10; // Obtém o dígito da dezena
        int unidade = numeroCDU % 10;  // Obtém o dígito da unidade

        // Reescreve o número no formato U CD
        int numeroReescrito = (unidade * 100) + (centena * 10) + dezena;

        // Exibe o número reescrito
        System.out.println("Número reescrito no formato U CD: " + numeroReescrito);
    }
}