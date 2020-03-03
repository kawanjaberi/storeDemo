package org.store.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduct;

    private String productName;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "product")
    private Foods food;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "product")
    private Electronic electronic;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "product")
    private Clothes clothe;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idOrder", nullable = false)
    private Orders order;

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Foods getFood() {
        return food;
    }

    public void setFood(Foods food) {
        this.food = food;
    }

    public Electronic getElectronic() {
        return electronic;
    }

    public void setElectronic(Electronic electronic) {
        this.electronic = electronic;
    }

    public Clothes getClothe() {
        return clothe;
    }

    public void setClothe(Clothes clothe) {
        this.clothe = clothe;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }
}
