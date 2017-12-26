package com.sigit.pattern.stuctural.decorator.tax;


import com.sigit.pattern.stuctural.decorator.Deducation;

public class PPH21 extends ATax implements Deducation {


    public PPH21(Deducation deducation) {
        super(deducation);
    }


    @Override
    public int getTakeHomePay() {
        int deducation = 0;
        int salaryIncTax = this.getDeducation().getBaseSalary() - 54000000;
        if(salaryIncTax > 0 ){
            deducation = (int) (salaryIncTax * 0.05);
        }
        return this.getDeducation().getTakeHomePay() - deducation;
    }
}
