package com.example.Investment_Stock_Api.Services;


import com.example.Investment_Stock_Api.Models.PortfolioItem;
import com.example.Investment_Stock_Api.Models.User;
import com.example.Investment_Stock_Api.Repositories.PortfolioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioItemService {

    private final PortfolioRepository portfolioRepository;

    public PortfolioItemService(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    public List<PortfolioItem> getUserPortfolio(User user) {
        return portfolioRepository.findByUser(user);
    }

    public PortfolioItem addItemToPortfolio(PortfolioItem item) {
        return portfolioRepository.save(item);
    }

    public void deletePortfolioItem(Long id) {
        portfolioRepository.deleteById(id);
    }
}

