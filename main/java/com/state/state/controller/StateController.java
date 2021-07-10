package com.state.state.controller;

import com.state.state.entity.State;
import com.state.state.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@CrossOrigin("*")
@RequestMapping("/state")
public class StateController {
    @Autowired
    StateService service;

    @GetMapping("/")
    public Set<State> getState(){
        return service.getState();
    }

    @PostMapping("/")
    public State addState(@RequestBody State state){
        return  service.addState(state);
    }
}
