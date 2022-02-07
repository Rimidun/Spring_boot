package com.spring.springboot.service;


import com.spring.springboot.dao.HeroesDotaDAO;
import com.spring.springboot.entity.HeroesDota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HeroesDotaServiceImpl implements HeroesDotaService {

    @Autowired
    private HeroesDotaDAO heroesDotaDAO;

    @Override
    @Transactional
    public List<HeroesDota> getAllHeroesDota() {
        return heroesDotaDAO.getAllHeroesDota();
    }

//    @Override
//    @Transactional
//    public void saveHeroesDota(HeroesDota heroesDota) {
//        heroesDotaDAO.saveHeroesDota(heroesDota);
//    }
//
//    @Override
//    @Transactional
//    public HeroesDota getHeroesDota(int id) {
//        return heroesDotaDAO.getHeroesDota(id);
//    }
//
//    @Override
//    @Transactional
//    public void deleteHeroesDota(int id) {
//        heroesDotaDAO.deleteHeroesDota(id);
//    }


}

