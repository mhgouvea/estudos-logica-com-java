import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        float nota = sc.nextFloat();

        if(nota > 5){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
