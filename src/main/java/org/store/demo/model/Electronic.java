package org.store.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "electronics")
public class Electronic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idElectronic;

    private String electronicName;

    private Long electronicPrice;

    private Integer electronicCount;

    private String electronicBrand;

    private String electronicCategories;

    private String electronicDescription;

    private String electronicBrandCountry;

    private String electronicColor;

    private String electronicDimension;

    private Double electronicWeight;

    private String electronicMaterial;

    private String electronicCPU;
    private String electronicRAM;
    private String electronicHDD;
    private String electronicGPU;
    private String electronicMonitor;
    private String electronicBattery;
    private String electronicCamera;
    private String electronicAudio;
    private String electronicOS;


    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idProduct", nullable = false)
    private Product product;

    public Electronic() {
    }

    public Electronic(String electronicName,
                      Long electronicPrice,
                      Integer electronicCount,
                      String electronicBrand,
                      String electronicCategories,
                      String electronicDescription,
                      String electronicBrandCountry,
                      String electronicColor,
                      String electronicDimension,
                      Double electronicWeight,
                      String electronicMaterial,
                      String electronicCPU,
                      String electronicRAM,
                      String electronicHDD,
                      String electronicGPU,
                      String electronicMonitor,
                      String electronicBattery,
                      String electronicCamera,
                      String electronicAudio,
                      String electronicOS) {
        this.electronicName = electronicName;
        this.electronicPrice = electronicPrice;
        this.electronicCount = electronicCount;
        this.electronicCategories = electronicCategories;
        this.electronicDescription = electronicDescription;
        this.electronicBrandCountry = electronicBrandCountry;
        this.electronicColor = electronicColor;
        this.electronicDimension = electronicDimension;
        this.electronicWeight = electronicWeight;
        this.electronicMaterial = electronicMaterial;
        this.electronicCPU = electronicCPU;
        this.electronicRAM = electronicRAM;
        this.electronicHDD = electronicHDD;
        this.electronicGPU = electronicGPU;
        this.electronicMonitor = electronicMonitor;
        this.electronicBattery = electronicBattery;
        this.electronicCamera = electronicCamera;
        this.electronicAudio = electronicAudio;
        this.electronicOS = electronicOS;
    }

    public Long getIdElectronic() {
        return idElectronic;
    }

    public void setIdElectronic(Long idElectronic) {
        this.idElectronic = idElectronic;
    }

    public String getElectronicName() {
        return electronicName;
    }

    public void setElectronicName(String electronicName) {
        this.electronicName = electronicName;
    }

    public Long getElectronicPrice() {
        return electronicPrice;
    }

    public void setElectronicPrice(Long electronicPrice) {
        this.electronicPrice = electronicPrice;
    }

    public Integer getElectronicCount() {
        return electronicCount;
    }

    public void setElectronicCount(Integer electronicCount) {
        this.electronicCount = electronicCount;
    }

    public String getElectronicBrand() {
        return electronicBrand;
    }

    public void setElectronicBrand(String electronicBrand) {
        this.electronicBrand = electronicBrand;
    }

    public String getElectronicCategories() {
        return electronicCategories;
    }

    public void setElectronicCategories(String electronicCategories) {
        this.electronicCategories = electronicCategories;
    }

    public String getElectronicDescription() {
        return electronicDescription;
    }

    public void setElectronicDescription(String electronicDescription) {
        this.electronicDescription = electronicDescription;
    }

    public String getElectronicBrandCountry() {
        return electronicBrandCountry;
    }

    public void setElectronicBrandCountry(String electronicBrandCountry) {
        this.electronicBrandCountry = electronicBrandCountry;
    }

    public String getElectronicColor() {
        return electronicColor;
    }

    public void setElectronicColor(String electronicColor) {
        this.electronicColor = electronicColor;
    }

    public String getElectronicDimension() {
        return electronicDimension;
    }

    public void setElectronicDimension(String electronicDimension) {
        this.electronicDimension = electronicDimension;
    }

    public Double getElectronicWeight() {
        return electronicWeight;
    }

    public void setElectronicWeight(Double electronicWeight) {
        this.electronicWeight = electronicWeight;
    }

    public String getElectronicMaterial() {
        return electronicMaterial;
    }

    public void setElectronicMaterial(String electronicMaterial) {
        this.electronicMaterial = electronicMaterial;
    }

    public String getElectronicCPU() {
        return electronicCPU;
    }

    public void setElectronicCPU(String electronicCPU) {
        this.electronicCPU = electronicCPU;
    }

    public String getElectronicRAM() {
        return electronicRAM;
    }

    public void setElectronicRAM(String electronicRAM) {
        this.electronicRAM = electronicRAM;
    }

    public String getElectronicHDD() {
        return electronicHDD;
    }

    public void setElectronicHDD(String electronicHDD) {
        this.electronicHDD = electronicHDD;
    }

    public String getElectronicGPU() {
        return electronicGPU;
    }

    public void setElectronicGPU(String electronicGPU) {
        this.electronicGPU = electronicGPU;
    }

    public String getElectronicMonitor() {
        return electronicMonitor;
    }

    public void setElectronicMonitor(String electronicMonitor) {
        this.electronicMonitor = electronicMonitor;
    }

    public String getElectronicBattery() {
        return electronicBattery;
    }

    public void setElectronicBattery(String electronicBattery) {
        this.electronicBattery = electronicBattery;
    }

    public String getElectronicCamera() {
        return electronicCamera;
    }

    public void setElectronicCamera(String electronicCamera) {
        this.electronicCamera = electronicCamera;
    }

    public String getElectronicAudio() {
        return electronicAudio;
    }

    public void setElectronicAudio(String electronicAudio) {
        this.electronicAudio = electronicAudio;
    }

    public String getElectronicOS() {
        return electronicOS;
    }

    public void setElectronicOS(String electronicOS) {
        this.electronicOS = electronicOS;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
