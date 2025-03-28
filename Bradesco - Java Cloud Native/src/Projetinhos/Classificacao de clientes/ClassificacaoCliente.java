import java.util.Scanner;

public class ClassificacaoCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoCliente = scanner.nextDouble();

        if (saldoCliente < 0){
            System.out.println("Negativado");
        } else if(saldoCliente >=0 && saldoCliente <=500){
            System.out.println("Baixo");
        } else if(saldoCliente > 500){
            System.out.println("Confortavel");
        }

        scanner.close();
    }
}
