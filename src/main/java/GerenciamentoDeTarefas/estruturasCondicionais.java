package GerenciamentoDeTarefas;

public class estruturasCondicionais {
    public static void main(String[] args) {
        //condições "if" só podem ser executadas se essa condição for verdadeira
        if(true){
            System.out.println("dentro do if");
        }

        System.out.println("fora do if");

        //exemplo abaixo, sobre vendas de bebidas alcolicas

        String nome = "josé";
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("consumo de bebidas alcolicas liberado");
        }
        // podemos usar o "else" nesse caso mas isso é só um exemplo usando o if, mostrando que também podemos usar o if
        if(!isAutorizadoComprarBebida){
            System.out.println("consumo de bebidas alcolicas não liberado");
        }
    }
}
