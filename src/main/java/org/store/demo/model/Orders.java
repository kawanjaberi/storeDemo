package org.store.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOrder;

    private Date orderDate;

    private Date orderRecevieDate;

    private Long orderPrice;

    private String orderState;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    @OneToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "order")
    private Set<Product> product;

    public Orders() {
    }

    public Orders(Date orderDate,
             Date orderRecevieDate,
             Long orderPrice,
             String orderState) {
        this.orderDate=orderDate;
        this.orderRecevieDate=orderRecevieDate;
        this.orderPrice=orderPrice;
        this.orderState=orderState;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderRecevieDate() {
        return orderRecevieDate;
    }

    public void setOrderRecevieDate(Date orderRecevieDate) {
        this.orderRecevieDate = orderRecevieDate;
    }

    public Long getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }
}
