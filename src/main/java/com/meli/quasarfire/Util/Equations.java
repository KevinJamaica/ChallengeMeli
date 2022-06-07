package com.meli.quasarfire.Util;

import com.meli.quasarfire.Dto.EquationDto;
import com.meli.quasarfire.Exceptions.EquationsException;

import java.util.ArrayList;
import java.util.List;

public final class Equations {
    List<EquationDto> equations = new ArrayList<>();

    EquationDto equationClearedY;

    double xResult;
    double yResult;

    public Equations() {
    }

    private EquationDto resolveEquationSystem() {
        double factor;
        EquationDto result = new EquationDto();
        for (EquationDto equation : this.equations) {
            if (equation.getOrder() == 1) {
                factor = 2;
            } else {
                factor = -1;
            }
            equation.setxSquearedValue(equation.getxSquearedValue() * factor);
            equation.setxValue(equation.getxValue() * factor);
            equation.setySquearedValue(equation.getySquearedValue() * factor);
            equation.setyValue(equation.getyValue() * factor);
            equation.setNatural(equation.getNatural() * factor);
            equation.setEqualValue(equation.getEqualValue() * factor);
        }

        result.setxSquearedValue(0);
        result.setxValue(0);
        result.setySquearedValue(0);
        result.setyValue(0);
        result.setNatural(0);
        result.setEqualValue(0);

        for (EquationDto equation : this.equations) {
            result.setxSquearedValue(result.getxSquearedValue() + equation.getxSquearedValue());
            result.setxValue(result.getxValue() + equation.getxValue());
            result.setySquearedValue(result.getySquearedValue() + equation.getySquearedValue());
            result.setyValue(result.getyValue() + equation.getyValue());
            result.setNatural(result.getNatural() + equation.getNatural());
            result.setEqualValue(result.getEqualValue() + equation.getEqualValue());
        }

        return result;
    }

    private void clearY(EquationDto equation) throws EquationsException {
        EquationDto equationClearY= new EquationDto();
        if (equation.getxSquearedValue() != 0 ||
                equation.getySquearedValue() != 0 ) {
            throw new EquationsException();
        } else {
            equationClearY.setxSquearedValue(equation.getxSquearedValue());
            equationClearY.setySquearedValue(equation.getySquearedValue());
            equationClearY.setyValue(1);
            equationClearY.setEqualValue(0);
            equationClearY.setxValue((-1 * equation.getxValue()) / equation.getyValue());
            equationClearY.setNatural((equation.getEqualValue() - equation.getNatural()) / equation.getyValue());
        }
        this.equationClearedY = equationClearY;
    }

    private EquationDto findX(EquationDto equationClearedY) throws EquationsException {
        EquationDto equationToFindX = new EquationDto();
        EquationDto equationFindX = new EquationDto();
        double factor = 2;
        if (this.equations != null &&
                !this.equations.isEmpty()) {
            equationToFindX = this.equations.get(0);
            equationToFindX.setxSquearedValue(equationToFindX.getxSquearedValue() / factor);
            equationToFindX.setxValue(equationToFindX.getxValue() / factor);
            equationToFindX.setySquearedValue(equationToFindX.getySquearedValue() / factor);
            equationToFindX.setyValue(equationToFindX.getyValue() / factor);
            equationToFindX.setNatural(equationToFindX.getNatural() / factor);
            equationToFindX.setEqualValue(equationToFindX.getEqualValue() / factor);
        }

        try {
            equationFindX.setySquearedValue(0);
            equationFindX.setyValue(0);
            equationFindX.setEqualValue(0);
            equationFindX.setxSquearedValue(
                    equationToFindX.getxSquearedValue() + (equationToFindX.getySquearedValue() * Math.pow(equationClearedY.getxValue(),2))
            );
            equationFindX.setxValue(
                    equationToFindX.getxValue() +
                            (equationToFindX.getySquearedValue() * 2 * equationClearedY.getNatural() * equationClearedY.getxValue()) +
                            (equationToFindX.getyValue() * equationClearedY.getxValue())
            );
            equationFindX.setNatural(
                    (equationToFindX.getySquearedValue() * Math.pow(equationClearedY.getNatural(),2)) +
                            (equationToFindX.getyValue() * equationClearedY.getNatural()) +
                            (equationToFindX.getNatural() - equationToFindX.getEqualValue())
            );
        } catch (ArithmeticException ex) {
            throw new EquationsException();
        }

        return equationFindX;
    }

    private double resolveQuadraticEquationPositiveValue(EquationDto equation) {
        double result = 0;
        result = (((-1 * equation.getxValue()) + Math.sqrt(Math.pow(equation.getxValue(),2)-(4*equation.getxSquearedValue()*equation.getNatural()))) / (2 * equation.getxSquearedValue()));
        if (Double.isNaN(result)) {
            throw new EquationsException();
        }
        return result;
    }

    private double resolveQuadraticEquationNegativeValue(EquationDto equation) {
        double result = 0;
        result = (((-1 * equation.getxValue()) - Math.sqrt(Math.pow(equation.getxValue(),2)-(4*equation.getxSquearedValue()*equation.getNatural()))) / (2 * equation.getxSquearedValue()));
        if (Double.isNaN(result)) {
            throw new EquationsException();
        }
        return result;
    }

    public double getxResult() {
        clearY(resolveEquationSystem());
        this.xResult = resolveQuadraticEquationNegativeValue(findX(this.equationClearedY));
        return this.xResult;
    }

    public double getyResult() {
        this.yResult = this.equationClearedY.getNatural() + (this.equationClearedY.getxValue() * this.xResult);
        return this.yResult;
    }

    public List<EquationDto> getEquations() {
        return equations;
    }

    public void setEquations(List<EquationDto> equations) {
        this.equations = equations;
    }
}
