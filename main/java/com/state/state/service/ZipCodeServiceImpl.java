package com.state.state.service;

import com.state.state.entity.ZipCode;
import com.state.state.repository.ZipCodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class ZipCodeServiceImpl implements ZipCodeService{
    @Autowired
    ZipCodeRepo zipCodeRepo;

    @Override
    public ZipCode addZipCode(ZipCode zipCode) {
        return zipCodeRepo.save(zipCode);
    }

    @Override
    public Set<ZipCode> getZipCode() {
        return null;
    }

    @Override
    public ZipCode getZipCodeById(Long id) {
        return zipCodeRepo.findById(id).get();
    }
}
