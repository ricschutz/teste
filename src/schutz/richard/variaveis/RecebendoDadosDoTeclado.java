package schutz.richard.variaveis;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite o sua idade: ");
        int idade = teclado.nextInt();
        System.out.println(nome+ " tem " +idade+ " anos.");
    }
}
