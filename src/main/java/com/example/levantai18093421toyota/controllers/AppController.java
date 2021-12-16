package com.example.levantai18093421toyota.controllers;

import com.example.levantai18093421toyota.Interfaces.ToyotaInterface;
import com.example.levantai18093421toyota.Repositorys.ToyotaRepository;
import com.example.levantai18093421toyota.entity.Toyota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    ToyotaInterface toyotaInterface;

    @Cacheable(value = "GetAll")
    @GetMapping("/toyota")
    public List<Toyota> GetAll(){
        return  toyotaInterface.GetList();
    }

    @Cacheable(value = "Post")
    @PostMapping("/toyota")
    public String  Post(@RequestBody Toyota toyota){
        toyota.setId(0);
        toyotaInterface.AddToyota(toyota);
        return "Add success";
    }
    @Cacheable(value = "PutTo")
    @PutMapping("/toyota")
    public String  PutTo(@RequestBody Toyota toyota){
        toyotaInterface.Update(toyota);
        return "UPdate success";
    }
    @Cacheable(value = "DeleteTo")
    @DeleteMapping("/toyota/{id}")
    public String  DeleteTo(@PathVariable long id){
        toyotaInterface.Delete(id);
        return "Delete success";
    }
}
