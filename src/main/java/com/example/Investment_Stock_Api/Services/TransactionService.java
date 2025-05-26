package com.example.Investment_Stock_Api.Services;
import com.example.Investment_Stock_Api.Models.Transaction;
import com.example.Investment_Stock_Api.Models.User;
import com.example.Investment_Stock_Api.Repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction addTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactionsByUser(User user) {
        return transactionRepository.findByUser(user);
    }
}


