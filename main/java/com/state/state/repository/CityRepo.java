package com.state.state.repository;

import com.state.state.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<City,Long> {
}
