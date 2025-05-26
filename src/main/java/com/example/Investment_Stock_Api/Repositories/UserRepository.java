package com.example.Investment_Stock_Api.Repositories;

import com.example.Investment_Stock_Api.Models.Transaction;
import com.example.Investment_Stock_Api.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
    List<User> findByUsername(String username);

}
