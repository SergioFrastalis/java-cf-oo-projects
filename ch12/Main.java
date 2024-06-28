package gr.aueb.cf.ch12.model;

public class Main {
    public static void main(String[] args) {
        // Create an instance of UserApp to instantiate inner classes
       UserApp userApp = new UserApp();

        // Creating an instance of User for Alice
        UserApp.User alice = userApp.new User();

        // Setting values for Alice
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        // Creating an instance of UserCredentials for Alice
        UserApp.UserCredentials aliceCredentials = userApp.new UserCredentials();

        // Setting values for Alice's credentials
        aliceCredentials.setId(1);
        aliceCredentials.setUsername("alice");
        aliceCredentials.setPassword("wonderland");

        // Printing values for Alice
        System.out.println("User ID: " + alice.getId());
        System.out.println("User First Name: " + alice.getFirstname());
        System.out.println("User Last Name: " + alice.getLastname());

        // Printing values for Alice's credentials
        System.out.println("UserCredentials ID: " + aliceCredentials.getId());
        System.out.println("UserCredentials Username: " + aliceCredentials.getUsername());
        System.out.println("UserCredentials Password: " + aliceCredentials.getPassword());
    }
}
