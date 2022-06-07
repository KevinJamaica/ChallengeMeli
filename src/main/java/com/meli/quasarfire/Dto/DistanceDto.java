package com.meli.quasarfire.Dto;

public class DistanceDto {
    private double distance;
    private CoordinateDto coordinateOrigin;
    private CoordinateDto coordinateDestiny;

    public DistanceDto() {
    }

    public DistanceDto(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public CoordinateDto getCoordinateOrigin() {
        return coordinateOrigin;
    }

    public void setCoordinateOrigin(CoordinateDto coordinateOrigin) {
        this.coordinateOrigin = coordinateOrigin;
    }

    public CoordinateDto getCoordinateDestiny() {
        return coordinateDestiny;
    }

    public void setCoordinateDestiny(CoordinateDto coordinateDestiny) {
        this.coordinateDestiny = coordinateDestiny;
    }
}
