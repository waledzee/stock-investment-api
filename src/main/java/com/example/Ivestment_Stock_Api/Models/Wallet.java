package com.example.Ivestment_Stock_Api.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.example.stockinvestmentapi.model.User

import java.math.BigDecimal;

public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private BigDecimal Balance;



    @Column(nullable = false, unique = true)
    private  User user;
}
