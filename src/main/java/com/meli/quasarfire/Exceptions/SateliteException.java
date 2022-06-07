package com.meli.quasarfire.Exceptions;

public class SateliteException extends RuntimeException {
    public SateliteException() {
        super("Insufficient information to calculate");
    }
    public SateliteException(String sateliteName) {
        super("There is not satelite with name of " + sateliteName) ;
    }

}
