package com.example.Investment_Stock_Api.Repositories;

import com.example.Investment_Stock_Api.Models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface StockRepository extends JpaRepository<Stock,Long>
{
    Optional<Stock> findBySymbol(String symbol);

    boolean existsBySymbol(String symbol);
}
