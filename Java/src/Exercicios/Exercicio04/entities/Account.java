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

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount){
        balance += amount;
    }

    public void withdraw (double amount){
        balance -= amount + 5.00;
    }

    
    
}
