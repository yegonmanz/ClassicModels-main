package com.classicmodels.classicmodels.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productlines")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Productline {
    @Id
    @Column(name = "product_line", nullable = false, length = 50)
    private String productLine;

    @Column(name = "text_description", length = 4000)
    private String textDescription;

    @Lob
    @Column(name = "html_description")
    private String htmlDescription;

    @Column(name = "image")
    private byte[] image;

    public Productline(String productLine) {
        this.productLine = productLine;
    }

    public Productline() {
        // Default constructor
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static Productline fromString(String productLine) {
        return new Productline(productLine);
    }
}       