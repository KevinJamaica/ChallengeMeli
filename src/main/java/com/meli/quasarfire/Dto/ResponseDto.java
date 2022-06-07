package com.meli.quasarfire.Dto;

public class ResponseDto {
    private CoordinateDto position;
    private String message;

    public CoordinateDto getPosition() {
        return position;
    }

    public void setPosition(CoordinateDto position) {
        this.position = position;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
