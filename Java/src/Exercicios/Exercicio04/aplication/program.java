package Exercicio04.aplication;

import java.util.Locale;
import java.util.Scanner;

import Exercicio04.entities.Account;

public class program {
    public static void main(String [] args ){
        Locale.setDefault(Locale.US); // Define o padrão de localização para US (ponto como separador decimal)
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine(); // Consome a quebra de linha pendente
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n) ?  ");
        char response = sc.next().charAt(0);

        // Verifica se haverá depósito inicial
        if (response == 'y') {
            System.out.print("Enter a inicial deposit value: ");
            double inicialDepoit = sc.nextDouble();
            account= new Account(number, holder, inicialDepoit); // Cria conta com depósito inicial
        } else {
            account = new Account(number, holder); // Cria conta sem depósito inicial
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account); // Exibe dados da conta
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue); // Realiza depósito
        System.out.println("Updated account data:");
        System.out.println(account); // Exibe dados atualizados

        System.out.println();
        System.out.print("Enter a witdraw value: ");
        double witdrawValue = sc.nextDouble();
        account.withdraw(witdrawValue); // Realiza saque
        System.out.println("Updated account data:");
        System.out.println(account); // Exibe dados atualizados

        sc.close(); // Fecha o scanner
    }
}
