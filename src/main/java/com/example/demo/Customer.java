package com.example.demo;


import org.hibernate.annotations.Table;

import javax.persistence.*;

import lombok.Data;


@Data
@Entity
@Table(appliesTo = "Customer")
public class Customer {
    @Id
    @Column(name = "customer_id", nullable = false)
    private Integer customerID;

    @Column(name = "user_id", nullable = false)
    private Integer userID;

    @Column(name = "city")
    int city;

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }


    public Customer() {
    }

    public Customer(int userID, int customerID, int city) {
        this.userID = userID;
        this.customerID = customerID;
        this.city = city;
    }

}
