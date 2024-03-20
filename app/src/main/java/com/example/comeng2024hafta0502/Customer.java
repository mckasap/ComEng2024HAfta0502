package com.example.comeng2024hafta0502;

public class Customer {
    private int id;
    private String Fname;
    private String Lname;
    private String Email;

    public Customer(){}

    public Customer(String fname, String lname, String email) {
        Fname = fname;
        Lname = lname;
        Email = email;
    }

    public Customer(int id, String fname, String lname, String email) {
        this.id = id;
        Fname = fname;
        Lname = lname;
        Email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    @Override
    public String toString(){

        return getFname() +" " +getLname() +" "+ getEmail();
    }
}
