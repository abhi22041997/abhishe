package com.state.state.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name="zipcodes")
public class ZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zipcodeId;
    private String content;
    @ManyToOne(fetch =FetchType.EAGER)
    private City city;

    public ZipCode(long zipcodeId, String content, City city) {
        this.zipcodeId = zipcodeId;
        this.content = content;
        this.city = city;
    }
    public ZipCode(){}

    public long getZipcodeId() {
        return zipcodeId;
    }

    public void setZipcodeId(long zipcodeId) {
        this.zipcodeId = zipcodeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
