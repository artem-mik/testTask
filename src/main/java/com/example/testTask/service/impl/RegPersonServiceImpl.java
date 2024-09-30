package com.example.testTask.service.impl;

import com.example.testTask.entities.RegPerson;
import com.example.testTask.repositories.RegPersonRepository;
import com.example.testTask.service.RegPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegPersonServiceImpl implements RegPersonService {

    private final RegPersonRepository regPersonRepository;

    @Override
    public RegPerson initRegPerson(RegPerson regPerson){
        return regPersonRepository.save(regPerson);
    }

    @Override
    public List<RegPerson> getAllRegPersons(){
        return regPersonRepository.findAll();
    }
}