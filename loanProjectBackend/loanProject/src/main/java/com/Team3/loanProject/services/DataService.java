package com.Team3.loanProject.services;

import com.Team3.loanProject.entities.Data;
import com.Team3.loanProject.repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DataService {

    @Autowired
    DataRepository dataRepository;

    public Data getData(int id){
        Optional<Data> optional = dataRepository.findById(id);
        Data data=optional.get();
        return data;
    }


}
