package com.infogalaxy;

public class Contact {
    private String firstname;
    private String lastname;
    private String address;
    private String state;
    private String city;
    private String zip;
    private String phoneno;
    private String email;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    public String getAddress() {
        return this.address;
    }
    public String getState() {
        return this.state;
    }
    public String getCity() {
        return this.city;
    }
    public String getZip() {
        return this.zip;
    }
    public String getPhoneno() {
        return this.phoneno;
    }
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
