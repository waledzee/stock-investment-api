package com.example.Ivestment_Stock_Api.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String symbol;


    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false, unique = true)
    private BigDecimal currentPrice;


    @OneToMany(mappedBy = "Stock", cascade = CascadeType.ALL)
    private List<PortfolioItem> portfolio;

    @OneToMany(mappedBy = "Stock", cascade = CascadeType.ALL)
    private List<Transaction> transactions;
}
