// Declaração da classe SomaBinaria
public class SomaBinaria {

    // Método principal que será executado ao rodar o programa
    public static void main(String[] args) {
        // Declaração de três strings representando números binários
        String binario1 = "1101"; // Representa o número binário 1101
        String binario2 = "111";  // Representa o número binário 111
        String binario3 = "101";  // Representa o número binário 101

        // Chama o método somarBinarios para somar os três números binários
        // e armazena o resultado na variável 'resultado'
        String resultado = somarBinarios(binario1, binario2, binario3);

        // Imprime o resultado da soma dos números binários
        System.out.println("Resultado da soma: " + resultado);
    }

    // Método que realiza a soma de três números binários
    public static String somarBinarios(String binario1, String binario2, String binario3) {
        // Converte os números binários para inteiros decimais
        int decimal1 = Integer.parseInt(binario1, 2); // Converte binario1 para decimal
        int decimal2 = Integer.parseInt(binario2, 2); // Converte binario2 para decimal
        int decimal3 = Integer.parseInt(binario3, 2); // Converte binario3 para decimal

        // Soma os valores decimais
        int somaDecimal = decimal1 + decimal2 + decimal3;

        // Converte o resultado da soma de volta para uma string binária
        return Integer.toBinaryString(somaDecimal);
    }
}