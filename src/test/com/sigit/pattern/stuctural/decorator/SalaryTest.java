package com.sigit.pattern.stuctural.decorator;


import com.sigit.pattern.stuctural.decorator.Deducation;
import com.sigit.pattern.stuctural.decorator.Salary;
import com.sigit.pattern.stuctural.decorator.insurance.PersonalBPJS;
import com.sigit.pattern.stuctural.decorator.tax.PPH21;
import com.sigit.pattern.stuctural.decorator.tax.PPH23;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTest {


    @Test
    public void testSalaryNoDeducation() throws Exception {
        Deducation deducation = new Salary(60000000);
        Assert.assertEquals(deducation.getTakeHomePay(), 60000000);
        Assert.assertEquals(deducation.getBaseSalary(), 60000000);
    }

    @Test
    public void testSalaryWithBPJS() throws Exception {
        Deducation salaryWithBPJS = new Salary(60000000);
        salaryWithBPJS = new PersonalBPJS(salaryWithBPJS);
        Assert.assertEquals(salaryWithBPJS.getTakeHomePay(), 58200000);
        Assert.assertEquals(salaryWithBPJS.getBaseSalary(), 60000000);
    }



    @Test
    public void testSalaryWithPPH21BelowPTKP() throws Exception {
        Deducation salaryWithPPH21= new Salary(45000000);
        salaryWithPPH21 = new PPH21(salaryWithPPH21);
        Assert.assertEquals(salaryWithPPH21.getTakeHomePay(), 45000000);
        Assert.assertEquals(salaryWithPPH21.getBaseSalary(), 45000000);
    }


    @Test
    public void testSalaryWithPPH21() throws Exception {
        Deducation salaryWithBPJS = new Salary(60000000);
        salaryWithBPJS = new PPH21(salaryWithBPJS);
        Assert.assertEquals(salaryWithBPJS.getTakeHomePay(), 59700000);
        Assert.assertEquals(salaryWithBPJS.getBaseSalary(), 60000000);
    }

    @Test
    public void testSalaryWithPPH23() throws Exception {
        Deducation salaryWithPPH23= new Salary(60000000);
        salaryWithPPH23 = new PPH23(salaryWithPPH23);
        Assert.assertEquals(salaryWithPPH23.getTakeHomePay(), 58800000);
        Assert.assertEquals(salaryWithPPH23.getBaseSalary(), 60000000);
    }



    /**
     * test case
     * 60.000.00 - ( bpjs 3 % dari base salary ) - ( pph21 , 5% dari ptkp )
     * */
    @Test
    public void testSalaryBPJSAndPPH21() throws Exception {
        Deducation salaryWithBPJS = new Salary(60000000);
        salaryWithBPJS = new PersonalBPJS(salaryWithBPJS);

        Assert.assertEquals(salaryWithBPJS.getTakeHomePay(), 58200000);
        Assert.assertEquals(salaryWithBPJS.getBaseSalary(), 60000000);

        salaryWithBPJS = new PPH21(salaryWithBPJS);
        Assert.assertEquals(salaryWithBPJS.getTakeHomePay(), 57900000);
        Assert.assertEquals(salaryWithBPJS.getBaseSalary(), 60000000);
    }



    /**
     * test case
     * 60.000.00 - ( bpjs 3 % dari base salary ) - ( pph21 , 5% dari ptkp ) - (pph23 , 2% )
     * */
    @Test
    public void testSalaryBPJSAndPPH21AndPPH23() throws Exception {
        Deducation salaryDeducation = new Salary(60000000);
        salaryDeducation = new PersonalBPJS(salaryDeducation);

        Assert.assertEquals(salaryDeducation.getTakeHomePay(), 58200000);
        Assert.assertEquals(salaryDeducation.getBaseSalary(), 60000000);

        salaryDeducation = new PPH21(salaryDeducation);
        Assert.assertEquals(salaryDeducation.getTakeHomePay(), 57900000);
        Assert.assertEquals(salaryDeducation.getBaseSalary(), 60000000);


        salaryDeducation = new PPH23(salaryDeducation);
        Assert.assertEquals(salaryDeducation.getTakeHomePay(), 56700000);
        Assert.assertEquals(salaryDeducation.getBaseSalary(), 60000000);
    }
}
