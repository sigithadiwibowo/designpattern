package com.sigit.pattern.stuctural.decorator.insurance;


import com.sigit.pattern.stuctural.decorator.Deducation;

public class PersonalBPJS implements Deducation {


    private Deducation deducation;

    public PersonalBPJS(Deducation deducation) {
        this.deducation = deducation;
    }

    @Override
    public int getBaseSalary() {
        return this.deducation.getBaseSalary();
    }

    @Override
    public int getTakeHomePay() {
        return (int) (this.deducation.getTakeHomePay() - (this.deducation.getBaseSalary() * 0.03 ));
    }
}
