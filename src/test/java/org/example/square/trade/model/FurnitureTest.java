package org.example.square.trade.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FurnitureTest {

    @Test
    public void canCreateAFurnitureOnject(){
        Furniture furniture = new Furniture();
        Assertions.assertNotEquals(null,furniture);
    }

    @Test
    public void createFurniteWithAbstracFactory(){
        Furniture furniture = Furniture.createObject();
        Assertions.assertNotEquals(null, furniture);
    }
    @Test
    public void canEncapsulateFields(){
        Furniture furniture = Furniture.createObject();
        Assertions.assertTrue(furniture.getType() != null);
        Assertions.assertTrue( furniture.getKeyword() != null);
    }
}
