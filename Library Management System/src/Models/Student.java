package Models;

import java.time.LocalDate;

public class Student {

    private int StudentId;
    private String Name;
    private String Email;
    private int PhoneNo;
    private String Address;
    private int TotalBookIssued;
    private LocalDate subscriptionDate;
    private LocalDate ExpiryDate;
    private boolean IsSubscribed;

    public Student(){
        IsSubscribed = false;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public LocalDate getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(LocalDate membershipData) {
        subscriptionDate = membershipData;
    }

    public int getTotalBookIssued() {
        return TotalBookIssued;
    }

    public void setTotalBookIssued(int totalBookIssued) {
        TotalBookIssued = totalBookIssued;
    }

    public LocalDate getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        ExpiryDate = expiryDate;
    }

    public void setSubscribed(boolean subscribed){
        IsSubscribed = subscribed;
    }
    public boolean getSubscribed(){
        return IsSubscribed;
    }
}
