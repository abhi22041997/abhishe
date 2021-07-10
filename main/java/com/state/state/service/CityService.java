package com.state.state.service;

import com.state.state.entity.City;
import com.state.state.entity.State;

import java.util.Set;

public interface CityService {
    public City addCity(City city);
    public Set<City> getCity();
    public City getCityById(Long id);
}
