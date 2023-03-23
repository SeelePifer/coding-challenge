package org.example.square.trade.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneralApplianceTest {

    @Test
    public void canCreateObject(){
        GeneralAppliance generalAppliance = GeneralAppliance.createObject();

        Assertions.assertNotEquals(null, generalAppliance);
    }

    @Test
    public void canEncapsulateObject(){
        GeneralAppliance generalAppliance = GeneralAppliance.createObject();

        Assertions.assertTrue(generalAppliance.getKeyword()!=null);
        Assertions.assertTrue(generalAppliance.getType()!=null);
    }
}
