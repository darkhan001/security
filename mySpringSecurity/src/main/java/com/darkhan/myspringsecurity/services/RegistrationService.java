package com.darkhan.myspringsecurity.services;

import com.darkhan.myspringsecurity.model.Person;
import com.darkhan.myspringsecurity.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final PersonRepository personRepository;

    @Autowired
    public RegistrationService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void save(Person person){
        personRepository.save(person);
    }
}
