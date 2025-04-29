public class TiposPrimitivos {

    public static void main(String[] args) {

        // Tipos de dados numéricos inteiros
        byte idade = 30; // 8 bits (-128 a 127), usado para economizar memória em grandes arrays
        short numeroPequeno = 1000; // 16 bits (-32768 a 32767), útil para economizar memória em grandes arrays
        int numeroInteiro = 100000; // 32 bits (-2147483648 a 2147483647), tipo padrão para inteiros
        long numeroLongo = 10000000000L; // 64 bits (-9223372036854775808 a 9223372036854775807), usado quando um intervalo maior é necessário

        // Tipos de dados numéricos de ponto flutuante
        float preco = 99.99f; // 32 bits, precisão simples, usado para economizar memória em grandes arrays de ponto flutuante
        double saldo = 1000.50; // 64 bits, precisão dupla, tipo padrão para valores de ponto flutuante

        // Tipo de dados booleano
        boolean ehEstudante = true; // true ou false, usado para representar valores binários

        // Tipo de dados caractere
        char letra = 'A'; // 16 bits (Unicode), usado para representar caracteres

        // Imprimindo os valores
        System.out.println("Idade: " + idade); // Imprime a idade
        System.out.println("Número pequeno: " + numeroPequeno); // Imprime o número pequeno
        System.out.println("Número inteiro: " + numeroInteiro); // Imprime o número inteiro
        System.out.println("Número longo: " + numeroLongo); // Imprime o número longo
        System.out.println("Preço: " + preco); // Imprime o preço
        System.out.println("Saldo: " + saldo); // Imprime o saldo
        System.out.println("É estudante? " + ehEstudante); // Imprime se é estudante
        System.out.println("Letra: " + letra); // Imprime a letra
    }
}