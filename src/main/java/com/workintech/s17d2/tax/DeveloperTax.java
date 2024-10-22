package com.workintech.s17d2.tax;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("developerTax")
public class DeveloperTax implements Taxable{

    public static final double SIMPLE_TAX_RATE = 15d;
    public static final double MIDDLE_TAX_RATE = 25d;
    public static final double UPPER_TAX_RATE = 35d;

    @Override
    public double getSimpleTaxRate() {
        return SIMPLE_TAX_RATE;
    }

    @Override
    public double getMiddleTaxRate() {
        return MIDDLE_TAX_RATE;
    }

    @Override
    public double getUpperTaxRate() {
        return UPPER_TAX_RATE;
    }
}
