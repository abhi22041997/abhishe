package com.state.state.repository;

import com.state.state.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepo extends JpaRepository<State,Long> {
}
