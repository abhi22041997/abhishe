package com.state.state.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="states")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long stateId;
    private String title;
    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<City> cities = new HashSet<>();

    public State(long stateId, String title, Set<City> cities) {
        this.stateId = stateId;
        this.title = title;
        this.cities = cities;
    }
    public State(){}

    public long getStateId() {
        return stateId;
    }

    public void setStateId(long stateId) {
        this.stateId = stateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
}
