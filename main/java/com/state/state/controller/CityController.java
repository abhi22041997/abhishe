package com.state.state.controller;

import com.state.state.entity.City;
import com.state.state.entity.State;
import com.state.state.service.CityService;
import com.state.state.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@CrossOrigin("*")
@RequestMapping("/city")
public class CityController {

    @Autowired
    CityService cityService;

    @Autowired
    StateService stateService;
    @GetMapping("/state/{stateId}")
    public Set<City> getCityOfState(@PathVariable long stateId){
        State state = stateService.getStateById(stateId);
        Set<City> cities = state.getCities();
        return cities;
    }

    @PostMapping("/")
    public City addCity(@RequestBody City city){
        return  cityService.addCity(city);
    }
}
