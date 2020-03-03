package org.store.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clothes")
public class Clothes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClothes;

    private String clothesName;

    private Long clothesPrice;

    private Integer clothesCount;

    private String clothesBrand;

    private String clothesCategories;

    private String clothesDescription;

    private String clothesSize;

    private String clothesMaterial;

    private String clothesBrandCountry;

    private String clothesColor;

    private Gender clothesGender;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idProduct", nullable = false)
    private Product product;

    public Clothes() {
    }

    public Clothes(String clothesName,
                   Long clothesPrice,
                   Integer clothesCount,
                   String clothesBrand,
                   String clothesCategories,
                   String clothesDescription,
                   String clothesSize,
                   String clothesMaterial,
                   String clothesBrandCountry,
                   String clothesColor,
                   Gender clothesGender) {
        this.clothesName = clothesName;
        this.clothesPrice = clothesPrice;
        this.clothesCount = clothesCount;
        this.clothesBrand = clothesBrand;
        this.clothesCategories = clothesCategories;
        this.clothesDescription = clothesDescription;
        this.clothesSize = clothesSize;
        this.clothesMaterial = clothesMaterial;
        this.clothesBrandCountry = clothesBrandCountry;
        this.clothesColor = clothesColor;
        this.clothesGender = clothesGender;
    }

    public Long getIdClothes() {
        return idClothes;
    }

    public void setIdClothes(Long idClothes) {
        this.idClothes = idClothes;
    }

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }

    public Long getClothesPrice() {
        return clothesPrice;
    }

    public void setClothesPrice(Long clothesPrice) {
        this.clothesPrice = clothesPrice;
    }

    public Integer getClothesCount() {
        return clothesCount;
    }

    public void setClothesCount(Integer clothesCount) {
        this.clothesCount = clothesCount;
    }

    public String getClothesBrand() {
        return clothesBrand;
    }

    public void setClothesBrand(String clothesBrand) {
        this.clothesBrand = clothesBrand;
    }

    public String getClothesCategories() {
        return clothesCategories;
    }

    public void setClothesCategories(String clothesCategories) {
        this.clothesCategories = clothesCategories;
    }

    public String getClothesDescription() {
        return clothesDescription;
    }

    public void setClothesDescription(String clothesDescription) {
        this.clothesDescription = clothesDescription;
    }

    public String getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(String clothesSize) {
        this.clothesSize = clothesSize;
    }

    public String getClothesMaterial() {
        return clothesMaterial;
    }

    public void setClothesMaterial(String clothesMaterial) {
        this.clothesMaterial = clothesMaterial;
    }

    public String getClothesBrandCountry() {
        return clothesBrandCountry;
    }

    public void setClothesBrandCountry(String clothesBrandCountry) {
        this.clothesBrandCountry = clothesBrandCountry;
    }

    public String getClothesColor() {
        return clothesColor;
    }

    public void setClothesColor(String clothesColor) {
        this.clothesColor = clothesColor;
    }

    public Gender getClothesGender() {
        return clothesGender;
    }

    public void setClothesGender(Gender clothesGender) {
        this.clothesGender = clothesGender;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
