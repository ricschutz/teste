package schutz.richard.estruturascondicionais.ifelse;

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4700.50F;
        float resultado = 0F;
        String porcentagem = "";
        if (salario > 4500) {
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
           resultado = salario * 0.15F;
           porcentagem = "15%";
        }
        System.out.println("O valor final em porcentagem de " +porcentagem+ " é " +resultado);
    }
}
