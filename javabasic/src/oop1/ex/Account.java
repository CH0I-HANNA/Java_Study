package oop1.ex;

public class Account {
    int balance = 0;

    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
