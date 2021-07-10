package com.state.state.service;

import com.state.state.entity.City;
import com.state.state.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class CityServiceImpl implements CityService{
    @Autowired
    public CityRepo repo;

    @Override
    public City addCity(City city) {
        return repo.save(city);
    }

    @Override
    public Set<City> getCity() {
        Set citySet = new HashSet<>(repo.findAll());
        return citySet;
    }

    @Override
    public City getCityById(Long id) {
        return repo.findById(id).get();
    }
}
