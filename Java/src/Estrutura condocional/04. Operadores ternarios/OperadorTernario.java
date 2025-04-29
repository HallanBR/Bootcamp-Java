public class OperadorTernario {
    
    public static void main(String[] args){
        // Declaração de uma variável inteira para armazenar a idade
        int idade = 19;

        // Operador ternário para verificar se a idade é maior ou igual a 18
        // Se a condição (idade >= 18) for verdadeira, a mensagem será "Você é maior de idade."
        // Caso contrário, a mensagem será "Você é menor de idade."
        String mensagem = (idade >= 18) ? "Voce e maior de idade." : "Voce e menor de idade.";

        // Exibe a mensagem no console
        System.out.println(mensagem);
    }
}
