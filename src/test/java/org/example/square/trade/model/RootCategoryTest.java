package org.example.square.trade.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RootCategoryTest {

    @Test
    public void canCreateHomeApplicanceObject(){
        RootCategory rootCategory = RootCategory.createObject();
        Assertions.assertNotEquals(null, rootCategory);
    }

    @Test
    public void canEncapsulateFieldsInObject(){
        RootCategory rootCategory = RootCategory.createObject();

        Assertions.assertTrue(rootCategory.getKeyword() != null);
        Assertions.assertTrue(rootCategory.getType() != null);
    }

}
