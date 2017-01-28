package com.geekdos.model;

import java.io.Serializable;

/**
 * Created by theXuser on 02/12/2016.
 */
public class Note implements Serializable {
    private String name;
    private double value;

    public Note() {
    }

    public Note(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {

        return "Note : "+value;
    }
}
