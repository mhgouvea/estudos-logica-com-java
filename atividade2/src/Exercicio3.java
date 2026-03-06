import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double salario = sc.nextDouble();

        System.out.print("Digite uma nota entre 1 e 5: ");
        int nota = sc.nextInt();

        double aumento = 0;

        switch (nota) {
            case 1:
                aumento = 0; 
                break;
            case 2:
                aumento = salario * 0.05; 
                break;
            case 3:
                aumento = salario * 0.10;
                break;
            case 4:
                aumento = salario * 0.15; 
                break;
            case 5:
                aumento = salario * 0.20; 
                break;
            default:
                System.out.println("Nota invalida. Digite uma nota  entre 1 e 5");
                sc.close();
                return;
        }

        double novoSalario = salario + aumento;

        System.out.println("Salario digitado: R$" + salario);
        System.out.println("Aumento: R$" + aumento);
        System.out.println("Novo salario: R$" + novoSalario);

        sc.close();
    }
}
