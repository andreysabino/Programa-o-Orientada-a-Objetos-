import java.util.Scanner; //Biblioteca do Scanner

public class Angulos{
    public static void main(String[] args) {
        System.out.println("Digite o angulo para fazer sua conversão");
        //Abrindo o Scaner
        Scanner ent = new Scanner (System.in);
        double a1 = ent.nextDouble();

        ent.close();
    
        double conver;
        conver = (a1*(Math.PI/180));
        double sen = Math.sin(a1);
        double tan = Math.tan(a1);
        double cos = Math.cos(a1);

        double s = 1/sen ;
        double t = 1/tan ;
        double c = 1/cos ;
        double coss = 1/s;
        double cot = 1/t;
        double cossec = 1/c;

        System.out.printf("O valor convertido é : (%g)\n", conver);
        System.out.printf("O valor do Seno é: (%g)\n", s);
        System.out.printf("O valor da Tangente é: (%g)\n", t);
        System.out.printf("O valor do Cosseno é: (%g)\n", c);
        System.out.printf("O valor do Cosseno é: (%g)\n", coss);
        System.out.printf("O valor da Cotangente é: (%g)\n", cot);
        System.out.printf("O valor do Cossecante é: (%g)\n", cossec);
        
    }
}