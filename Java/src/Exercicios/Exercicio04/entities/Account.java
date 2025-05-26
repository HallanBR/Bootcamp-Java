package Exercicio04.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    
// um construtor com 2 atributos, number e holder //
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

// um construtor com 3 atributos, numer, holder e balance //
    public Account(int number, String holder, double initialbalance) {
        this.number = number;
        this.holder = holder;
        deposit(initialbalance);
    }

    // retorna o número da conta
    public int getNumber() {
        return number;
    }

    // retorna o nome do titular da conta
    public String getHolder() {
        return holder;
    }

    // altera o nome do titular da conta
    public void setHolder(String holder) {
        this.holder = holder;
    }

    // retorna o saldo atual da conta
    public double getBalance() {
        return balance;
    }

    // deposita um valor na conta
    public void deposit (double amount){
        balance += amount;
    }

    // saca um valor da conta, cobrando uma taxa fixa de 5.00
    public void withdraw (double amount){
        balance -= amount + 5.00;
    }

    public String toString(){
        return "Account "
                + number
                + ", holder: "
                + holder
                + ", balance: $ "
                + String.format("%.2f", balance); 
    }
}