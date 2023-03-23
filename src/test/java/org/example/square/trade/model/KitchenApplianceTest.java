package org.example.square.trade.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KitchenApplianceTest {

    @Test
    public void canCreateObject(){
        KitchenAppliance kitchenAppliance = (KitchenAppliance) KitchenAppliance.createObject();

        Assertions.assertNotNull(kitchenAppliance);
    }

    @Test
    public void canEncapsulateObject(){
        KitchenAppliance kitchenAppliance = (KitchenAppliance) KitchenAppliance.createObject();

        Assertions.assertTrue(kitchenAppliance.getKeyword()!=null);
        Assertions.assertTrue(kitchenAppliance.getType()!=null);
    }
}
