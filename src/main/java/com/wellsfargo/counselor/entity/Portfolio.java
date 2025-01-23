package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long PortfolioId;

    @Column(nullable = false)
    private long ClientId;

    @Column(nullable = false)
    private Date date;


    protected Portfolio() {

    }

    public Portfolio(long ClientId, Date date) {
        this.ClientId = ClientId;
        this.date = date;
    }

    public long getClientId() {
        return ClientId;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

}

