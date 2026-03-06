import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        System.out.println("Digite o quarto número: ");
        int num4 = sc.nextInt();

        int maior = num1;
        int menor = num1;

        if(num2 > maior){
            maior = num2;
        }if(num2 < menor){
            menor = num2;
        }if(num3 > maior){
            maior = num3;
        }if(num3 < menor){
            menor = num3;
        }if(num4 > maior){
            maior = num4;
        }if(num4 < menor){
            menor = num4;
        }

        System.out.println("o maior numero eh: " + maior);
        System.out.println("o menor numero eh: " + menor);

        sc.close();

    }
}
