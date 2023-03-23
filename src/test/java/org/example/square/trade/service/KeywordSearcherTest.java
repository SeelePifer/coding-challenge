package org.example.square.trade.service;

import org.example.square.trade.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;


//@RunWith(MockitoRunner.class)
//Problemas al bajar la dependencia, tema de intellij
public class KeywordSearcherTest {
    //Que se mockee esta clase, que prueba el servicio
    //@Mock
    private SearchService searchService;

    //InjectMocks te dice que inyectes por constructor estos valores
    //@InjectMocks
    private RootCategory rootCategory;
   // @InjectMocks
    private Furniture furniture;
   // @InjectMocks
    private HomeApplicance homeApplicance;
    //@InjectMocks
    private LawAndGarden lawAndGarden;
   // @InjectMocks
    private MajorApplicance majorApplicance;
    //@InjectMocks
    private MinorApplicance minorApplicance;
    //@InjectMocks
    private KitchenAppliance kitchenAppliance;

    //@InjectMocks
    private GeneralAppliance generalAppliance;
    @Test
    public void defaultKeyword(){

        searchService.searchByKeyword("");

        Assertions.assertTrue(searchService.searchByKeyword("") instanceof RootCategory);

    }
    @Test
    public void furnitureSearch(){

        searchService.searchByKeyword("furniture");

        Assertions.assertTrue(searchService.searchByKeyword("furniture") instanceof Furniture);
    }

    @Test
    public void homeApplianceSearch(){

        RootCategory homeApplicance = searchService.searchByKeyword("HomeApplicance");

        Assertions.assertTrue(homeApplicance instanceof HomeApplicance);


    }
    @Test
    public void lawAndGardenSearch(){
        final RootCategory lawAndGardenSearch = searchService.searchByKeyword("law&garden");

        Assertions.assertTrue(lawAndGardenSearch instanceof LawAndGarden);
    }

    @Test
    public void majorSearch(){
        final RootCategory majorSearch = searchService.searchByKeyword("majorAppliance");

        Assertions.assertTrue(majorSearch instanceof MajorApplicance);
    }
    @Test
    public void minorSearch(){

        final RootCategory minorSearch = searchService.searchByKeyword("minorappliance");

        Assertions.assertTrue(minorSearch instanceof MinorApplicance);
    }

    @Test
    public void kitchenSearch(){
        final RootCategory kitchenSearch = searchService.searchByKeyword("kitchenAppliance");

        Assertions.assertTrue(kitchenSearch instanceof KitchenAppliance);
    }
    @Test
    public void generalSearch(){
        final RootCategory generalSearch = searchService.searchByKeyword("general");

        Assertions.assertTrue(generalSearch instanceof GeneralAppliance);
    }
}
