import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float num1 = sc.nextFloat();

        System.out.println("Digite o segundo número: ");
        float num2 = sc.nextFloat();
        sc.nextLine();

        System.out.println("Digite qual operação deseja: +, -, *, /");
        String operacao = sc.nextLine(); 

        float resultado = 0;

        if (operacao.equals("+")) {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equals("*")) {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equals("/")) {
            if (num2 != 0) { 
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("erro. nao pode divisao por zero");
            }
        } else {
            System.out.println("operacao invalida.");
        }

        sc.close();
    }
}
