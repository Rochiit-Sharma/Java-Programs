class BankAccount {

    public static void main(String[] args) {

        Account account = new Account(123456789);

        account.displayAccount();
    }
}

class Account {

    final long accountNumber;
    double balance = 50000;

    Account(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    void displayAccount() {
        System.out.println("Bank Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
    }
}