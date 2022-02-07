package com.spring.springboot.dao;


import com.spring.springboot.entity.HeroesDota;

import java.util.List;

public interface HeroesDotaDAO {

    public List<HeroesDota> getAllHeroesDota();

    public void saveHeroesDota(HeroesDota heroesDota);

    public HeroesDota getHeroesDota(int id);

    public void deleteHeroesDota(int id);
}


