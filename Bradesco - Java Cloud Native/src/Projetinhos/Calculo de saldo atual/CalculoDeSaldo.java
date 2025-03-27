import java.util.Scanner;

public class CalculoDeSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.println("Insira o saldo inicial:"); // Solicita ao usuário o saldo inicial
        double saldoInicial = scanner.nextDouble(); // Lê o saldo inicial fornecido pelo usuário

        // Entrada das transações
        System.out.println("Insira o valor da primeira transação:"); // Solicita o valor da primeira transação
        double transacao1 = scanner.nextDouble(); // Lê o valor da primeira transação
        System.out.println("Insira o valor da segunda transação:"); // Solicita o valor da segunda transação
        double transacao2 = scanner.nextDouble(); // Lê o valor da segunda transação
        System.out.println("Insira o valor da terceira transacao:"); // Solicita o valor da terceira transação
        double transacao3 = scanner.nextDouble(); // Lê o valor da terceira transação

        // Cálculo do saldo final
        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3; // Soma o saldo inicial com as transações

        // Saída do saldo final
        System.out.println(saldoFinal); // Exibe o saldo final calculado

        scanner.close(); // Fecha o scanner para liberar recursos
    }
}