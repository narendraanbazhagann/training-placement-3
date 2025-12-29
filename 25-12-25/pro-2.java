import java.util.Scanner;

class BankAccount {
    String name;
    int accountNumber;
    double balance;

    void createAccount(String n, int acc, double bal) {
        name = n;
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("\nAccount Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        b.createAccount(name, acc, bal);

        int choice;
        do {
            System.out.println("\n1.Deposit 2.Withdraw 3.Display 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    b.deposit(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter amount: ");
                    b.withdraw(sc.nextDouble());
                }
                case 3 -> b.display();
            }
        } while (choice != 4);
    }
}
