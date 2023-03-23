package org.example.square.trade.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinorApplianceTest {

    @Test
    public void canCreateObject(){
        final MinorApplicance minorApplicance = (MinorApplicance) MinorApplicance.createObject();

        Assertions.assertNotEquals(null, minorApplicance);
    }

    @Test
    public void canEncapsulate(){

        final MinorApplicance minorApplicance = (MinorApplicance) MinorApplicance.createObject();

        Assertions.assertTrue(minorApplicance.getKeyword() != null);
        Assertions.assertTrue(minorApplicance.getType()!= null);
    }
}
