import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();

        double desconto = 0;
        double imposto = 0;
        double valorLiquido;

        if(salario < 1000){
            desconto = 0;
        }else if(salario >= 1000 && salario < 2000){
            desconto = salario * 0.07;
        }else if(salario >= 2000 && salario < 3000){
            desconto = salario * 0.15;
        }else if(salario >= 3000 && salario < 4000){
            desconto = salario * 0.22;
        }else if(salario > 4000){
            desconto = salario * 0.29;
        }

        imposto = desconto;
        valorLiquido = salario - desconto;

        System.out.println("Imposto sobre o salario: " + imposto);
        System.out.println("Valor descontado do salario: " + desconto);
        System.out.println("Valor liquido do salario: " + valorLiquido);

        sc.close();
    }
}
