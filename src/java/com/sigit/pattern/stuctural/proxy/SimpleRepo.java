package com.sigit.pattern.stuctural.proxy;/**
 * @author Sigit Hadi wibowo 
 * created date 5/22/2017.
 * Copyright 2017
 */



public interface SimpleRepo<T extends IsEntity>  {

    public T find(String key);
}
