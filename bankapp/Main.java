package gr.aueb.cf.ch13.bankapp;

import gr.aueb.cf.ch13.bankapp.model.OverdraftAccount;
import gr.aueb.cf.ch13.bankapp.model.JointAccount;

public class Main {
    public static void main(String[] args) {
        // Test OverdraftAccount
        OverdraftAccount overdraftAccount = new OverdraftAccount(1, "GR123456789", "Alice", "Wonderland", "123456789", 1000.0);

        System.out.println("Initial Balance: " + overdraftAccount.getBalance());

        try {
            overdraftAccount.withdraw(1200.0, "123-45-6789"); // Withdraw more than balance
            System.out.println("Current Balance after overdraft: " + overdraftAccount.getBalance());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Test JointAccount
        JointAccount jointAccount = new JointAccount(2, "GR987654321", "Bob", "Smith", "123456789",
                "Bob", "Johnson", "654-32-1098", 2000.0);

        System.out.println("\nJoint Account Details:");
        System.out.println(jointAccount);

        jointAccount.deposit(500.0);
        System.out.println("After deposit: " + jointAccount.getBalance());

        jointAccount.withdraw(1500.0);
        System.out.println("After withdrawal: " + jointAccount.getBalance());
    }
}
