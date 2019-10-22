package ru.aleynikov.blogcamp.dao;

import ru.aleynikov.blogcamp.model.Country;

import java.util.List;

public interface CountryDao {

    List<Country> findAllCountries();
    Country findById(int id);
}
