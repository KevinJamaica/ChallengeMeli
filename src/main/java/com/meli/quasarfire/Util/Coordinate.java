package com.meli.quasarfire.Util;

import com.meli.quasarfire.Dto.CoordinateDto;

public final class Coordinate {
    public static final CoordinateDto Kenobi = new CoordinateDto(-500, -200);
    public static final CoordinateDto Skywalker = new CoordinateDto(100, -100);
    public static final CoordinateDto Sato = new CoordinateDto(500, 100);

    public enum General {
        KENOBI,
        SKYWALKER,
        SATO
    }
}
