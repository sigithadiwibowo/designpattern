package com.sigit.pattern.stuctural.proxy.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/23/2017.
 *         Copyright 2017
 */


public class IstoraSenayan implements Senayan {
    private List<String> personList = new ArrayList<>();

    @Override
    public boolean enter(String person) {
        personList.add(person);
        System.out.println(person + " at istora senayan");
        return true ;
    }

    public List<String> getPersonList() {
        return personList;
    }

    public int getCountOfPerson() {
        return personList.size();
    }
}
