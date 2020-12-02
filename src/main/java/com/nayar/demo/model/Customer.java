package com.nayar.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerSurname, customerName, customerSecondName;

    private String groupName;

    private String phoneNumber;

    private boolean payment;

    private String login, customerPassword, accountRole;

    private Calendar paymentDay;

    public Customer() {
    }

    public Customer(String customerSurname, String customerName, String customerSecondName, String groupName, String phoneNumber, String login, String customerPassword) {
        this.customerSurname = customerSurname;
        this.customerName = customerName;
        this.customerSecondName = customerSecondName;
        this.groupName = groupName;
        this.phoneNumber = phoneNumber;
        this.login = login;
        this.customerPassword = customerPassword;
    }

    public Calendar getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(Calendar paymentDay) {
        this.paymentDay = paymentDay;
    }

    public String getAccountRole() {
        return accountRole;
    }

    public void setAccountRole(String accountRole) {
        this.accountRole = accountRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSecondName() {
        return customerSecondName;
    }

    public void setCustomerSecondName(String customerSecondName) {
        this.customerSecondName = customerSecondName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }
}
