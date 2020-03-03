package org.store.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "foods")
public class Foods implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFoods;

    private String foodName;

    private Long foodsPrice;

    private Integer foodCount;

    private String foodBrand;

    private String foodCategories;

    private String foodDescription;

    private Double foodWeight;

    private Date foodExpireDate;

    private Double foodCalories;
    private Double foodProtein;
    private Double foodFat;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idProduct", nullable = false)
    private Product product;

    public Foods() {
    }

    public Foods(String foodName,
                 Long foodsPrice,
                 Integer foodCount,
                 String foodBrand,
                 String foodCategories,
                 String foodDescription,
                 Double foodWeight,
                 Date foodExpireDate,
                 Double foodCalories,
                 Double foodProtein,
                 Double foodFat) {
        this.foodName = foodName;
        this.foodsPrice = foodsPrice;
        this.foodCount = foodCount;
        this.foodBrand = foodBrand;
        this.foodCategories = foodCategories;
        this.foodDescription = foodDescription;
        this.foodWeight = foodWeight;
        this.foodExpireDate = foodExpireDate;
        this.foodCalories = foodCalories;
        this.foodProtein = foodProtein;
        this.foodFat = foodFat;
    }

    public Long getIdFoods() {
        return idFoods;
    }

    public void setIdFoods(Long idFoods) {
        this.idFoods = idFoods;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Long getFoodsPrice() {
        return foodsPrice;
    }

    public void setFoodsPrice(Long foodsPrice) {
        this.foodsPrice = foodsPrice;
    }

    public Integer getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(Integer foodCount) {
        this.foodCount = foodCount;
    }

    public String getFoodBrand() {
        return foodBrand;
    }

    public void setFoodBrand(String foodBrand) {
        this.foodBrand = foodBrand;
    }

    public String getFoodCategories() {
        return foodCategories;
    }

    public void setFoodCategories(String foodCategories) {
        this.foodCategories = foodCategories;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public Double getFoodWeight() {
        return foodWeight;
    }

    public void setFoodWeight(Double foodWeight) {
        this.foodWeight = foodWeight;
    }

    public Date getFoodExpireDate() {
        return foodExpireDate;
    }

    public void setFoodExpireDate(Date foodExpireDate) {
        this.foodExpireDate = foodExpireDate;
    }

    public Double getFoodCalories() {
        return foodCalories;
    }

    public void setFoodCalories(Double foodCalories) {
        this.foodCalories = foodCalories;
    }

    public Double getFoodProtein() {
        return foodProtein;
    }

    public void setFoodProtein(Double foodProtein) {
        this.foodProtein = foodProtein;
    }

    public Double getFoodFat() {
        return foodFat;
    }

    public void setFoodFat(Double foodFat) {
        this.foodFat = foodFat;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
