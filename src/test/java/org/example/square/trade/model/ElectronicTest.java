package org.example.square.trade.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElectronicTest {

    @Test
    public void canCreateElectronicObject(){
        Electronic electronic = Electronic.createObject();
        Assertions.assertNotEquals(null, electronic);
    }
    @Test
    public void canEncapsulateFields(){
        Electronic electronic = Electronic.createObject();
        Assertions.assertTrue(electronic.getType() != null);
        Assertions.assertTrue( electronic.getKeyword() != null);
    }
}
