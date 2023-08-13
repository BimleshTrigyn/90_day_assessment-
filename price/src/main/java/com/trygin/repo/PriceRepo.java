package com.trygin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trygin.entity.Price;

@Repository
public interface PriceRepo extends JpaRepository<Price,Float> 
{

}
