import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double salario = sc.nextDouble();

        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();

        double aumento = 0;

        
        if (nota <= 2) {
            aumento = 0; 
        } else if (nota > 2 && nota <= 4) {
            aumento = salario * 0.05; 
        } else if (nota > 4 && nota <= 6) {
            aumento = salario * 0.10; 
        } else if (nota > 6 && nota <= 8) {
            aumento = salario * 0.15;
        } else if (nota > 8 && nota <= 10) {
            aumento = salario * 0.20;
        } else {
            System.out.println("Erro. A nota tem que ser entre 0 e 10");
            sc.close();
            return;
        }

        double novoSalario = salario + aumento;
    
        System.out.println("Salario de entrada: " + salario);
        System.out.println("Valor do aumento: " +  aumento);
        System.out.println("Valor do salario com o aumento: " + novoSalario);

        sc.close();
    }
}
