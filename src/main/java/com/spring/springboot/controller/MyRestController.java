package com.spring.springboot.controller;


import com.spring.springboot.entity.HeroesDota;
import com.spring.springboot.service.HeroesDotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dota")
public class MyRestController {

    @Autowired
    private HeroesDotaService heroesDotaService;

    @GetMapping("/heroes")
    public List<HeroesDota> showAllEmployees() {
        List<HeroesDota> allHeroesDota = heroesDotaService.getAllHeroesDota();
        return allHeroesDota;
    }

    @GetMapping("/heroes/{id}")
    public HeroesDota getHeroesDota(@PathVariable int id) {
        HeroesDota heroesDota = heroesDotaService.getHeroesDota(id);//

        return heroesDota;
    }

    @PostMapping("/heroes")
    public HeroesDota addNewHeroesDota(@RequestBody HeroesDota heroesDota) {
        heroesDotaService.saveHeroesDota(heroesDota);
        return heroesDota;
    }

    @PutMapping("/heroes")
    public HeroesDota updateHeroesDota(@RequestBody HeroesDota heroesDota) {
        heroesDotaService.saveHeroesDota(heroesDota);
        return heroesDota;
    }

    @DeleteMapping("/heroes/{id}")
    public String deleteHeroesDota(@PathVariable int id) {

        heroesDotaService.deleteHeroesDota(id);
        return "heroes wit ID = " + id + " was deleted";
    }
}
