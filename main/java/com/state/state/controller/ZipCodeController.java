package com.state.state.controller;

import com.state.state.entity.City;
import com.state.state.entity.State;
import com.state.state.entity.ZipCode;
import com.state.state.service.CityService;
import com.state.state.service.StateService;
import com.state.state.service.ZipCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@CrossOrigin("*")
@RequestMapping("/zipcode")
public class ZipCodeController {

    @Autowired
    ZipCodeService service;

    @Autowired
    CityService cityService;

    @GetMapping("/city/{cityId}")
    public Set<ZipCode> getZipCodeOfState(@PathVariable long cityId){
        City city = cityService.getCityById(cityId);
        Set<ZipCode> zipcodes = city.getZipCodes();
        return zipcodes;
    }
    @PostMapping("/")
    public ZipCode addZipCode(@RequestBody ZipCode zipCode){
        return  service.addZipCode(zipCode);
    }
}
