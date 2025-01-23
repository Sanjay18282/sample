package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long SecurityId;

    @Column(nullable = false)
    private long PortfolioId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private float PurchasePrice;

    @Column(nullable = false)
    private Date PurchaseDate;
    @Column(nullable = false)
    private float Quantity;


    protected Security() {

    }

    public Security(long PortfolioId,String Name, String Category, float PurchasePrice, Date PurchaseDate, float Quantity) {
        this.PortfolioId = PortfolioId;
        this.Name = Name;
        this.Category = Category;
        this.PurchasePrice = PurchasePrice;
        this.PurchaseDate = PurchaseDate;
        this.Quantity = Quantity;
    }

    public long getPortfolioId() {
        return PortfolioId;
    }
    public long setPortfolioId() {
        return PortfolioId;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }

    public void setPurchasePrice(float PurchasePrice) {
        this.PurchasePrice = PurchasePrice;
    }

    public float getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchaseDate(Date PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

    public Date PurchaseDate() {
        return PurchaseDate;
    }

    public void setQuantity(float Quantity) {
        this.Quantity = Quantity;
    }

    public float getQuantity() {
        return Quantity;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getCategory() {
        return Category;
    }

}
