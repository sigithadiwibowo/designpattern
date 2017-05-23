package com.sigit.pattern.stuctural.proxy;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/22/2017.
 *         Copyright 2017
 */


public class SimpleRepoImpl implements SimpleRepo<SimpleEntity> {

    PersistentManager persistentManager = new PersistentManager();


    @Override
    public SimpleEntity find(String key) {
        return persistentManager.find(SimpleEntity.class, key);
    }


}
