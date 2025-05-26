package com.example.Investment_Stock_Api.Repositories;

import com.example.Investment_Stock_Api.Models.Stock;
import com.example.Investment_Stock_Api.Models.Transaction;
import com.example.Investment_Stock_Api.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface TransactionRepository extends JpaRepository<Transaction,Long>

{

    List<Transaction> findByUser(User user);

}
