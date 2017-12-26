package com.sigit.pattern.stuctural.decorator.tax;


import com.sigit.pattern.stuctural.decorator.Deducation;

public abstract class ATax implements Deducation {

    private Deducation deducation;


    ATax(Deducation deducation) {
        this.deducation = deducation;
    }

    protected Deducation getDeducation(){
        return deducation ;
    }

    @Override
    public int getBaseSalary() {
        return this.deducation.getBaseSalary();
    }


}
