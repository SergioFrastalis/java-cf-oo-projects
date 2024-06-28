package gr.aueb.cf.ch12.model;

public class UserApp {
    // Assuming User is an inner class within UserApp
    public class User {
        private long id;
        private String firstname;
        private String lastname;

        // Constructor with parameters
        public User(long id, String firstname, String lastname) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public User() {

        }

        public long getId() {
            return id;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setId(long id) {
            this.id = id;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
    }

    public class UserCredentials {
        private long id;
        private String username;
        private String password;

        public UserCredentials(long id, String username, String password) {
            this.id = id;
            this.username = username;
            this.password = password;
        }

        public UserCredentials() {

        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }




}
