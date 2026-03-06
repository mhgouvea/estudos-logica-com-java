import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float nota1 = sc.nextFloat();

        System.out.println("Digite o primeiro número: ");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        if(media > 5){
            System.out.println("Aprovado");
        }else if(media < 5){
            System.out.println("Reprovado");
            System.out.println("Digite a terceira nota: ");
            float nota3 = sc.nextFloat();

            float menorNota;

            if(nota1 < nota2){
                menorNota = nota1;
            }else{
                menorNota = nota2;
            }

            float mediaNova = (nota1 + nota2 + nota3 - menorNota) / 2;

            if(mediaNova > 5){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
        }
        sc.close();
    }
}
