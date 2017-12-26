package com.sigit.pattern.stuctural.decorator.tax;


import com.sigit.pattern.stuctural.decorator.Deducation;

public class PPH23 extends ATax implements Deducation {


    public PPH23(Deducation deducation) {
        super(deducation);
    }

    @Override
    public int getTakeHomePay() {
        return (int) (this.getDeducation().getTakeHomePay() - (this.getDeducation().getBaseSalary() * 0.02 ));
    }
}
