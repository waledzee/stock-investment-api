package com.example.Investment_Stock_Api.Models;

import com.example.Investment_Stock_Api.Models.User;
import jakarta.persistence.*;

        import java.math.BigDecimal;

@Entity
@Table(name = "portfolio_items")
public class PortfolioItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}