package com.classicmodels.classicmodels.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_number", nullable = false)
    private Integer employeeNumber; // <-- changed from 'id' to 'employeeNumber'

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "extension", nullable = false, length = 10)
    private String extension;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "office_code", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Office officeCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reports_to")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Employee reportsTo;

    @Column(name = "job_title", nullable = false, length = 50)
    private String jobTitle;
}