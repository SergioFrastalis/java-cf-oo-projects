package gr.aueb.cf.ch13.bankapp.model;

public class JointAccount {
    private int id;
    private String iban;
    private String firstNameHolder1;
    private String lastNameHolder1;
    private String ssnHolder1;
    private String firstNameHolder2;
    private String lastNameHolder2;
    private String ssnHolder2;
    private double balance;

    public JointAccount(int id, String iban, String firstNameHolder1, String lastNameHolder1, String ssnHolder1,
                        String firstNameHolder2, String lastNameHolder2, String ssnHolder2, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstNameHolder1 = firstNameHolder1;
        this.lastNameHolder1 = lastNameHolder1;
        this.ssnHolder1 = ssnHolder1;
        this.firstNameHolder2 = firstNameHolder2;
        this.lastNameHolder2 = lastNameHolder2;
        this.ssnHolder2 = ssnHolder2;
        this.balance = balance;
    }

    // Add getters and setters for all fields

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount exceeds balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "JointAccount{" +
                "id=" + id +
                ", iban='" + iban + '\'' +
                ", firstNameHolder1='" + firstNameHolder1 + '\'' +
                ", lastNameHolder1='" + lastNameHolder1 + '\'' +
                ", ssnHolder1='" + ssnHolder1 + '\'' +
                ", firstNameHolder2='" + firstNameHolder2 + '\'' +
                ", lastNameHolder2='" + lastNameHolder2 + '\'' +
                ", ssnHolder2='" + ssnHolder2 + '\'' +
                ", balance=" + balance +
                '}';
    }
}
