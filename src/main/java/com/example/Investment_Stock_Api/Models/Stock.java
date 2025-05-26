package com.example.Investment_Stock_Api.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "stocks")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String symbol;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private BigDecimal currentPrice;

    @JsonIgnore
    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
    private List<PortfolioItem> portfolio;

    @JsonIgnore
    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    // Getters and Setters
    public Stock() {

    }


    public Stock(Long id, List<Transaction> transactions, List<PortfolioItem> portfolio, BigDecimal currentPrice, String companyName, String symbol) {
        this.id = id;
        this.transactions = transactions;
        this.portfolio = portfolio;
        this.currentPrice = currentPrice;
        this.companyName = companyName;
        this.symbol = symbol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public List<PortfolioItem> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(List<PortfolioItem> portfolio) {
        this.portfolio = portfolio;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
