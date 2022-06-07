package com.meli.quasarfire.Dto;

import java.util.List;

public class EquationDto {
    private int order;
    private double xSquearedValue;
    private double ySquearedValue;
    private double xValue;
    private double yValue;
    private double natural;
    private double equalValue;

    public double getxSquearedValue() {
        return xSquearedValue;
    }

    public void setxSquearedValue(double xSquearedValue) {
        this.xSquearedValue = xSquearedValue;
    }

    public double getySquearedValue() {
        return ySquearedValue;
    }

    public void setySquearedValue(double ySquearedValue) {
        this.ySquearedValue = ySquearedValue;
    }

    public double getxValue() {
        return xValue;
    }

    public void setxValue(double xValue) {
        this.xValue = xValue;
    }

    public double getyValue() {
        return yValue;
    }

    public void setyValue(double yValue) {
        this.yValue = yValue;
    }

    public double getNatural() {
        return natural;
    }

    public void setNatural(double natural) {
        this.natural = natural;
    }

    public double getEqualValue() {
        return equalValue;
    }

    public void setEqualValue(double equalValue) {
        this.equalValue = equalValue;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
