package com.example.Investment_Stock_Api.Models;

import com.example.Investment_Stock_Api.Models.User;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "portfolio_items")
public class PortfolioItem {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        private User user;


        @ManyToOne
        @JoinColumn(name = "stock_id", nullable = false)
        private Stock stock;


        @Column(nullable = false)
        private int quantity;


        @Column(nullable = false)
        private BigDecimal averagePrice;


        @Column(nullable = false)
        private LocalDateTime lastUpdated;

        public PortfolioItem()
        {
        }
        public PortfolioItem(Long id, LocalDateTime lastUpdated, BigDecimal averagePrice, int quantity, Stock stock, User user) {
            this.id = id;
            this.lastUpdated = lastUpdated;
            this.averagePrice = averagePrice;
            this.quantity = quantity;
            this.stock = stock;
            this.user = user;
        }

        public LocalDateTime getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(LocalDateTime lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public BigDecimal getAveragePrice() {
            return averagePrice;
        }

        public void setAveragePrice(BigDecimal averagePrice) {
            this.averagePrice = averagePrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public Stock getStock() {
            return stock;
        }

        public void setStock(Stock stock) {
            this.stock = stock;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }


