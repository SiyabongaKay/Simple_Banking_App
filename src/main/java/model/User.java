package model;

import java.util.UUID;

public class User {
    private UUID userID;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Address address;

    public User() {}
    public User(String username, String password, String firstName, String lastName, String email, String phone) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = new Address();
    }

    public UUID getUserID() {return this.userID;}

    public String getUsername() {return this.username;}
    public String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}

    public String getPassword() {return this.password;}
    public void setPassword(String password) {this.password = password;}

    public String getPhone() {return this.phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public Address getAddress() {return this.address;}

    public String getEmail() {return this.email;}
    public void setEmail(String email) {this.email = email;}


}
