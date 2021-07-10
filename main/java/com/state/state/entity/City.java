package com.state.state.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cityId;
    private String title;
    @ManyToOne(fetch = FetchType.EAGER)
    private State state;
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ZipCode> zipCodes = new HashSet<>();


    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Set<ZipCode> getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(Set<ZipCode> zipCodes) {
        this.zipCodes = zipCodes;
    }
    public City(){}

    public City(long cityId, String title, State state, Set<ZipCode> zipCodes) {
        this.cityId = cityId;
        this.title = title;
        this.state = state;
        this.zipCodes = zipCodes;
    }
}
