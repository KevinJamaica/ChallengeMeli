package com.meli.quasarfire.Util;

import com.meli.quasarfire.Dto.DistanceDto;
import com.meli.quasarfire.Dto.EquationDto;

public final class Formulas {
    public Formulas() {
    }

    public void distanceFormula(DistanceDto distanceToCalculate) {
        double distance = Math.sqrt(
                Math.pow((distanceToCalculate.getCoordinateDestiny().getX() - distanceToCalculate.getCoordinateOrigin().getX()), 2)
                        +
                        Math.pow((distanceToCalculate.getCoordinateDestiny().getY() - distanceToCalculate.getCoordinateOrigin().getY()), 2)
        );
        distanceToCalculate.setDistance(distance);
    }

    public static EquationDto distanceToEquation(DistanceDto distance) {
        EquationDto equation = new EquationDto();
        equation.setEqualValue(Math.pow(distance.getDistance(), 2));
        equation.setxSquearedValue(1);
        equation.setySquearedValue(1);
        equation.setxValue(-2 * distance.getCoordinateDestiny().getX());
        equation.setyValue(-2 * distance.getCoordinateDestiny().getY());
        equation.setNatural(Math.pow(distance.getCoordinateDestiny().getX(), 2) + Math.pow(distance.getCoordinateDestiny().getY(), 2));
        return equation;
    }

}
