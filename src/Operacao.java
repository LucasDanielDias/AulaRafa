import java.util.Scanner;
public class Operacao {
    public static void main(String[] args) {
       Scanner Ler = new Scanner(System.in);
       int volta=0;
       double pot;
       float som, sub, div, mult, ValA, ValB;
        System.out.println("Olá digite 2 valores para as aperações");

        ValA = Ler.nextFloat();
        Ler = new Scanner(System.in);

        ValB = Ler.nextFloat();

        som = ValA + ValB;
        if (ValA>ValB){
        sub = ValA - ValB;}
        else{
            System.out.println("Não pode haver numero negativo");
            sub = 0;
        }
        if(ValA != 0 && ValB != 0){
        div = ValA / ValB;}
        else{
            System.out.println("Divisão Invalida");
            div = 0;
        }
        mult = ValA * ValB;
        pot = Math.pow(ValA,ValB);
        System.out.println("A soma de A e B é : " + som);
        System.out.println("A subtração de A e B é : " + sub);
        System.out.println("A divisão de A e B é : " + div);
        System.out.println("A multiplicação de A e B é : " + mult);
        System.out.println("A divisão de A e B é : " + div);
        System.out.println("A potencia de A e B é : " + pot);
        if (ValA<=30){
            while (ValA<=30) {
                ValA = ValA + 1;
                volta = volta + 1;
            }
        }
        System.out.println("A teve que rodar " + volta + " Para chegar ou superar 30");
    }
}
