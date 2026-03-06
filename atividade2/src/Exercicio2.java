import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 10: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                System.out.println("Sete");
                System.out.println("Oito");
                System.out.println("Nove");
                System.out.println("Dez");
                break;
            case 7:
                System.out.println("Sete");
                System.out.println("Oito");
                System.out.println("Nove");
                System.out.println("Dez");
                break;
            case 8:
                System.out.println("Oito");
                System.out.println("Nove");
                System.out.println("Dez");
                break;
            case 9:
                System.out.println("Nove");
                System.out.println("Dez");
                break;
            case 10:
                System.out.println("Dez");
                break;
            default:
                System.out.println("Numero invalido. Digite um numero entre 1 e 10");
        }

        sc.close();
    }
}
