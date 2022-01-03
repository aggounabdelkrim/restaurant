package com.formation.restaurant.dao;

import com.formation.restaurant.models.Restaurant;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Karim
 */
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>{
    
}
