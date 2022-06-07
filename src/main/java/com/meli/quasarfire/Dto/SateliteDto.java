package com.meli.quasarfire.Dto;

import java.util.List;

public class SateliteDto {
    private String name;
    private double distance;
    private String[] message;

    public SateliteDto() {
    }

    public SateliteDto(String name, double distance, String[] message) {
        this.name = name;
        this.distance = distance;
        this.message = message;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String[] getMessage() {
        return message;
    }

    public void setMessage(String[] message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
