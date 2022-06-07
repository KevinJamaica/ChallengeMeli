package com.meli.quasarfire.Services;

import com.meli.quasarfire.Dto.*;
import com.meli.quasarfire.Exceptions.SateliteException;
import com.meli.quasarfire.Util.Coordinate;
import com.meli.quasarfire.Util.Equations;
import com.meli.quasarfire.Util.Formulas;
import com.meli.quasarfire.Util.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SateliteService {

    private List<SateliteDto> satelites = new ArrayList<>();

    public ResponseDto calculateMessageOrigin(List<SateliteDto> satelites) {
        ResponseDto response = new ResponseDto();
        Equations equations = new Equations();
        Message message = new Message();
        EquationDto equationDto = new EquationDto();
        DistanceDto distanceDto = new DistanceDto();
        CoordinateDto coordinateDto = new CoordinateDto();
        int order = 1;
        for (SateliteDto satelite : satelites) {
            distanceDto = new DistanceDto(satelite.getDistance());
            switch (satelite.getName().toUpperCase()) {
                case ("KENOBI"):
                    distanceDto.setCoordinateDestiny(Coordinate.Kenobi);
                    break;
                case ("SKYWALKER"):
                    distanceDto.setCoordinateDestiny(Coordinate.Skywalker);
                    break;
                case ("SATO"):
                    distanceDto.setCoordinateDestiny(Coordinate.Sato);
                    break;
                default:
            }
            equationDto = Formulas.distanceToEquation(distanceDto);
            equationDto.setOrder(order++);
            equations.getEquations().add(equationDto);
            message.getMessages().add(satelite.getMessage());
        }

        coordinateDto.setX(equations.getxResult());
        coordinateDto.setY(equations.getyResult());
        response.setPosition(coordinateDto);
        response.setMessage(message.resolveMessage());
        return response;
    }

    public SateliteDto saveOrUpdate(SateliteDto satelite) {
        boolean sateliteExists = false;
        int position = 0;

        for (SateliteDto sateliteAux : this.satelites) {
            if (sateliteAux.getName().equals(satelite.getName())) {
                position = this.satelites.indexOf(sateliteAux);
                sateliteExists = true;
            }
        }

        if (!sateliteExists) {
            this.satelites.add(satelite);
        } else {
            this.satelites.add(position, satelite);
        }

        return satelite;
    }

    public ResponseDto findMessage() {
        return calculateMessageOrigin(this.satelites);
    }

    public List<SateliteDto> getSatelites() {
        return satelites;
    }
}
