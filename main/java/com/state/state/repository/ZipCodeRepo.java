package com.state.state.repository;

import com.state.state.entity.ZipCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipCodeRepo extends JpaRepository<ZipCode,Long> {
}
