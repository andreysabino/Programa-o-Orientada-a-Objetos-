import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Float NotaUm = 0.0F, NotaDois = 0.0F, NotaTres= 0.0F, soma =0.0F;


        System.out.print("Digite a sua primeira nota: ");
        NotaUm = entrada.nextFloat();
        System.out.print("Digite a sua primeira nota: ");
        NotaDois = entrada.nextFloat();
        System.out.print("Digite a sua primeira nota: ");
        NotaTres = entrada.nextFloat();

        soma = NotaUm+NotaDois+NotaTres;

        System.out.println("A soma dos números é igual a : "+soma);
        System.out.printf("A media dos números é igual a : %.2f \n",soma/3);

        //Entrada.close porque "entrada" é o nome do Scanner
        entrada.close();
    }
}
