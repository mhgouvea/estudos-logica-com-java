//Esse é um exercício em Java que mostra os conceitos de variáveis e listas. Este programa permite que o usuário inserira nomes de frutas em uma lista e exibe a lista completa ao final.

import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        String fruta;
        ArrayList<String> listaDeFrutas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome das frutas (digite 'sair' para encerrar):");

        while (true) {
            System.out.print("Digite uma fruta: ");
            fruta = scanner.nextLine();
            if (fruta.equalsIgnoreCase("sair")) {
                break;
            }
            listaDeFrutas.add(fruta);
        }
        System.out.println("\nLista de frutas:");
        for (String f : listaDeFrutas) {
            System.out.println("- " + f);
        }

        scanner.close();
    }
}
