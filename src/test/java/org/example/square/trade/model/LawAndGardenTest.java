package org.example.square.trade.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LawAndGardenTest {

    @Test
    public void canCreateObject(){
        LawAndGarden lawAndGarden = (LawAndGarden) LawAndGarden.createObject();

        Assertions.assertNotNull(lawAndGarden);
    }
    @Test
    public void canEncapsulateFields(){
        LawAndGarden lawAndGarden = (LawAndGarden) LawAndGarden.createObject();

        Assertions.assertTrue(lawAndGarden.getKeyword() != null);
        Assertions.assertTrue(lawAndGarden.getType() != null);
    }
}
