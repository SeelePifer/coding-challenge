package org.example.square.trade.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorApplianceTest {

    @Test
    public void canCreateObject(){
        MajorApplicance majorApplicance = (MajorApplicance) MajorApplicance.createObject();

        Assertions.assertNotEquals(null, majorApplicance);
    }

    @Test
    public void canEncapsulate(){
        MajorApplicance majorApplicance = (MajorApplicance) MajorApplicance.createObject();

        Assertions.assertTrue(majorApplicance.getKeyword()!= null);
        Assertions.assertTrue(majorApplicance.getType()!= null);
    }
}
