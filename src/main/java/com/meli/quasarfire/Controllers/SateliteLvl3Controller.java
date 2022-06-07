 package com.meli.quasarfire.Controllers;

import com.meli.quasarfire.Dto.ResponseDto;
import com.meli.quasarfire.Dto.SateliteDto;
import com.meli.quasarfire.Exceptions.SateliteException;
import com.meli.quasarfire.Services.SateliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/topsecret_split/")
public class SateliteLvl3Controller {
    @Autowired
    private SateliteService sateliteService;

    @PostMapping(path="/{satelite_name}")
    public @ResponseBody String create(@PathVariable String satelite_name, @RequestBody SateliteDto satelite) {
        if (!satelite_name.equalsIgnoreCase("Kenobi") &&
                !satelite_name.equalsIgnoreCase("Skywalker") &&
                !satelite_name.equalsIgnoreCase("Sato")) {
            return "There is not satelite with name of " + satelite_name;
        }
        satelite.setName(satelite_name);
        sateliteService.saveOrUpdate(satelite);
        return "Data save success: " + satelite_name;
    }

    @GetMapping
    public @ResponseBody ResponseDto responseMessage() {
        if (sateliteService.getSatelites().size() < 3) {
            ResponseDto response = new ResponseDto();
            response.setMessage("Insufficient information to calculate");
            return response;
        }
        return sateliteService.findMessage();
    }

    @GetMapping(path="/reset")
    public @ResponseBody String reset() {
        sateliteService.getSatelites().clear();
        return "Reset success!";
    }

}
