package com.meli.quasarfire.Controllers;

import com.meli.quasarfire.Dto.ResponseDto;
import com.meli.quasarfire.Dto.SateliteDto;
import com.meli.quasarfire.Services.SateliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/topsecret/")
public class SateliteLvl2Controller {
    @Autowired
    private SateliteService sateliteService;

    @PostMapping
    public @ResponseBody ResponseDto findMessageOrigin(@RequestBody List<SateliteDto> satelites) {
        return sateliteService.calculateMessageOrigin(satelites);
    }

    @GetMapping(path="example-bodyin")
    public @ResponseBody List<SateliteDto> exampleBodyIn() {
        List<SateliteDto> satelites = new ArrayList<>();
        SateliteDto sateliteDto = new SateliteDto();
        for (int i = 0; i < 3; i++) {
            sateliteDto.setName("NameExample_" + i);
            sateliteDto.setDistance(100 + (100*i));
            sateliteDto.setMessage(new String[]{"example", "for", "construct", "body", "i"});
            satelites.add(sateliteDto);
        }

        return satelites;
    }

}
