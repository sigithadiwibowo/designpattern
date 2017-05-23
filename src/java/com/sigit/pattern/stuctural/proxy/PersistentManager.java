package com.sigit.pattern.stuctural.proxy;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/22/2017.
 *         Copyright 2017
 */


public class PersistentManager {

    public <T extends IsEntity> T find(Class<T> instance, Serializable key) {
        System.out.println("Do some query - PersistentManager.find - " + key);
        IsEntity entity = buildOne(instance);
        entity.setId((String) key);
        entity.setName(key + " name ");
        entity.setDesc(key + " desc ");
        return (T) entity;
    }

    public <T extends IsEntity> T buildOne(Class<T> instance) {
        try {
            return instance.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void initialize(Object entity) {
        System.out.println("PersistentManager.initialize");
        Class entityClass = entity.getClass();
        List<Method> methodList = new ArrayList<Method>(Arrays.asList(entityClass.getDeclaredMethods()));
        for (Method method : methodList) {
            if (method.isAnnotationPresent(LazyAnnotation.class)) {
                System.out.println("method.getName() = " + method.getName().substring(3));
                try {
                    Method setMethod = entityClass.getDeclaredMethod("set" + method.getName().substring(3) , String.class);
                    method.setAccessible(true);
                    setMethod.invoke(entity, "test");
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
