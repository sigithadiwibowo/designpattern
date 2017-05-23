package com.sigit.pattern.stuctural.proxy;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/22/2017.
 *         Copyright 2017
 */

public class SimpleEntity implements IsEntity{

    private String id;
    private String name;
    private String desc;
    private String sampleLazyProperties ;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @LazyAnnotation
    public String getSampleLazyProperties() {
        return sampleLazyProperties;
    }

    public void setSampleLazyProperties(String sampleLazyProperties) {
        this.sampleLazyProperties = sampleLazyProperties;
    }
}
