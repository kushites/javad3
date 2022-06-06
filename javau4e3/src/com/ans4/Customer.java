package com.ans4;

public class Customer {
    private String username;
    private String password;
    private String mobilenumber;
    private String email;

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

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    Customer(){

    }

    public Customer(String username, String password, String mobilenumber, String email) {
        this.username = username;
        this.password = password;
        this.mobilenumber = mobilenumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobilenumber='" + mobilenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
