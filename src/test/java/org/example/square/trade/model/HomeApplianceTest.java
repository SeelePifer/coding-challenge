package org.example.square.trade.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeApplianceTest {
    @Test
    public void canCreateHomeApplicanceObject(){
        HomeApplicance homeApplicance = HomeApplicance.createObject();
        Assertions.assertNotEquals(null, homeApplicance);
    }

    @Test
    public void canEncapsulateFieldsInObject(){
        HomeApplicance homeApplicance = HomeApplicance.createObject();

        Assertions.assertTrue(homeApplicance.getKeyword() != null);
        Assertions.assertTrue(homeApplicance.getType() != null);
    }
}
