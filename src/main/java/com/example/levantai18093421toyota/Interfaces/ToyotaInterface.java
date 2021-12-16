package com.example.levantai18093421toyota.Interfaces;

import com.example.levantai18093421toyota.entity.Toyota;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface ToyotaInterface {
    public Boolean AddToyota(Toyota toyota);
    public Boolean Update(Toyota toyota);
    public Boolean Delete(long id);
    public List<Toyota> GetList();
}
