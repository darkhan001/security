package com.darkhan.myspringsecurity.repositories;

import com.darkhan.myspringsecurity.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person,Integer> {

    Optional<Person> findByUsername(String username);
}
