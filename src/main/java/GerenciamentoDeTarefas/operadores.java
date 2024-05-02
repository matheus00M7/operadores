package operadores;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class operadores {
    public static void main(String[] args) {

        double numero01 = 100;
        double numero02 = 10;
        double numero03 = 30;

        double resultado1 = numero01 + numero02;
        System.out.println(resultado1);

     double resultado2 = numero01 - numero02;
        System.out.println(resultado2);

     double resultado3 = numero01 / numero02;
        System.out.println(resultado3);

     double resultado4 = numero01 * numero02;
        System.out.println(resultado4);

     double resultado5 = numero02 / numero03;
        System.out.println(resultado5);



        //operadores logicos

        // "%" resto da divisão
        int resto = 90 % 73;
        System.out.println(resto);

        // <, >, <=, >=, ==, !=
        // variaveis desse tipo sempre retornam valores booleanos
        boolean trintaMaiorQueDez = 30 > 10;
        boolean trintaMenorQueDez = 30 < 10;
        boolean trintaMenorOuIgualDez = 30 <= 10;
        boolean trintaMaiorOuIgualDez = 30 >= 10;
        boolean trintaIgualDez = 30 == 10;
        boolean tritaDiferenteDez = 30 != 10;

        System.out.println("trintaMaiorQueDez " + trintaMaiorQueDez);
        System.out.println("trintaMenorQueDez " + trintaMenorQueDez);
        System.out.println("trintaMenorOuIgualDez " + trintaMenorOuIgualDez);
        System.out.println("trintaMaiorOuIgualDez " + trintaMaiorOuIgualDez);
        System.out.println("trintaIgualDez " + trintaIgualDez);
        System.out.println("tritaDiferenteDez " +tritaDiferenteDez);

        // (&& "and, e"), (|| "or, ou")

        String apelido = "matheusinho";
        int horasDeJogo = 1390;
        boolean condicao1 = apelido.equals("matheusinho") && horasDeJogo > 1000;
            System.out.println("condição 1: " + condicao1);
        boolean condicao2 = apelido.equals("matheusinho") || horasDeJogo > 1000;
            System.out.println("condição 2: " + condicao2);

// veja um exemplo a seguir usando if else
        String apelido2 = "matheusinho";
        int horasDeJogo2 = 1000;

        if (apelido2.equals("matheusinho") || horasDeJogo > 1000) {
            System.out.println("Você é um jogador dedicado!");
        }else{
              System.out.println("Você ainda está começando.");
        }

        String apelido3 = "joao";
        int horasDeJogo3 = 100;

        if (apelido3.equals("matheusinho") && horasDeJogo > 1000) {
            System.out.println("você é um bom jogador dedicado!");
        }else{
            System.out.println("voce ainda está começando.");
        }
    }
}