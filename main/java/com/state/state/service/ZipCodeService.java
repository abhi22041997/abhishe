package com.state.state.service;

import com.state.state.entity.State;
import com.state.state.entity.ZipCode;

import java.util.Set;

public interface ZipCodeService {
    public ZipCode addZipCode(ZipCode zipCode);
    public Set<ZipCode> getZipCode();
    public ZipCode getZipCodeById(Long id);
}
