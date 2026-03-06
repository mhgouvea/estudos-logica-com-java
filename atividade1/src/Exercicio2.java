import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Esse numero é par!");
        }else{
            System.out.println("Esse número é impar!");
        }

        sc.close();
    }
}
