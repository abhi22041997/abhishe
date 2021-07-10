package com.state.state.service;

import com.state.state.entity.State;
import com.state.state.repository.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class StateServiceImpl implements StateService{
    @Autowired
    public StateRepo stateRepo;

    @Override
    public State addState(State state) {
        return stateRepo.save(state);
    }

    @Override
    public Set<State> getState() {
        Set stateSet =new HashSet<>(stateRepo.findAll());
        return stateSet;


    }

    @Override
    public State getStateById(Long id) {
        return stateRepo.findById(id).get();
    }

}
