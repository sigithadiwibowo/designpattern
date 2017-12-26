package com.sigit.pattern.stuctural.proxy.security;

import java.util.HashMap;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/23/2017.
 *         Copyright 2017
 */


public class WeTheFestAtIstoraSenayan implements Senayan {

    IstoraSenayan istoraSenayan = new IstoraSenayan();
    private HashMap<String, Boolean> registeredPerson = new HashMap<>();

    public WeTheFestAtIstoraSenayan() {
        registeredPerson.put("sigit", true);
        registeredPerson.put("hadi", true);
        registeredPerson.put("wibowo", true);
    }

    @Override
    public boolean enter(String person) {
        Boolean isAllowed = registeredPerson.get(person);
        if (isAllowed != null && isAllowed)
            return istoraSenayan.enter(person);
        else{
            System.out.println(person + " is not allowed because no ticket available for him / her ");
            return false ;
        }
    }
}
