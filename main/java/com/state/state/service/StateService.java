package com.state.state.service;

import com.state.state.entity.State;

import java.util.Set;

public interface StateService {
    public State addState(State state);
    public Set<State> getState();
    public State getStateById(Long id);
}
