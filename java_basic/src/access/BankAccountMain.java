package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.diposit(10000);
        account.withdraw(3000);
        System.out.println("balance: " + account.getBalance());
    }
}
