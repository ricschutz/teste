package schutz.richard.estruturascondicionais.ifelse;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'M';
        int idade = 18;

        if (idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo == 'M') {
            System.out.println("Alistamento obrigatório");
        } else if (sexo == 'F') {
            System.out.println("Deseja se alistar?");
        } else {
            System.out.println("Sexo inválido. Só existem dois sexos");
        }


    }
}
