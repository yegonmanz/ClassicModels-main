package com.classicmodels.classicmodels.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "customer_number", nullable = false)
    private Integer id;

    @Column(name = "customer_name", nullable = false, length = 50)
    private String customerName;

    @Column(name = "contact_last_name", nullable = false, length = 50)
    private String contactLastName;

    @Column(name = "contact_first_name", nullable = false, length = 50)
    private String contactFirstName;

    @Column(name = "phone", nullable = false, length = 50)
    private String phone;

    @Column(name = "address_line1", nullable = false, length = 50)
    private String addressLine1;

    @Column(name = "address_line2", length = 50)
    private String addressLine2;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "postal_code", length = 15)
    private String postalCode;

    @Column(name = "country", nullable = false, length = 50)
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sales_rep_employee_number")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Employee salesRepEmployeeNumber;

    @Column(name = "credit_limit", precision = 10, scale = 2)
    private BigDecimal creditLimit;

    public Integer getCustomerNumber() {
        return id;
    }

}