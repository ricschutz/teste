package schutz.richard.estruturascondicionais.ifelse;

public class VerificaIdade {
    public static void main(String[] args) {
       int idade = 15;
       // ==, !=, <, <=, >, >=
       if (idade > 18)
           System.out.println("Adulto");
       else {
           System.out.print("Ainda não é adulto");
       }
    }
}