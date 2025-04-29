import java.util.Scanner;

public class ClassificacaoCliente {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê o saldo do cliente fornecido pelo usuário
        double saldoCliente = scanner.nextDouble();

        // Verifica a classificação do cliente com base no saldo
        if (saldoCliente < 0) {
            // Caso o saldo seja negativo
            System.out.println("Negativado");
        } else if (saldoCliente >= 0 && saldoCliente <= 500) {
            // Caso o saldo esteja entre 0 e 500 (inclusive)
            System.out.println("Baixo");
        } else if (saldoCliente > 500) {
            // Caso o saldo seja maior que 500
            System.out.println("Confortavel");
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
