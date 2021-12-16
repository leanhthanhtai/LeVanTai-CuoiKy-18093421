package com.example.levantai18093421toyota.service;

import com.example.levantai18093421toyota.Interfaces.ToyotaInterface;
import com.example.levantai18093421toyota.Repositorys.ToyotaRepository;
import com.example.levantai18093421toyota.entity.Toyota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToyotaService implements ToyotaInterface {
    @Autowired
    ToyotaRepository toyotaRepository;
    @Override
    public Boolean AddToyota(Toyota toyota) {
      toyotaRepository.saveAndFlush(toyota);
        return true;
    }

    @Override
    public Boolean Update(Toyota toyota) {
        toyotaRepository.save(toyota);
        return true;
    }

    @Override
    public Boolean Delete(long id) {
        Toyota toyota = toyotaRepository.findById(id).get();
        toyotaRepository.delete(toyota);
        return true;
    }

    @Override
    public List<Toyota> GetList() {
        return toyotaRepository.findAll();
    }
}
