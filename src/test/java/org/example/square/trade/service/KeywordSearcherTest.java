package org.example.square.trade.service;

import org.example.square.trade.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class KeywordSearcherTest {

    @InjectMocks
    private SearchService searchService;

    @Mock
    private KeywordsEngine rootCategory;

    @Mock
    private Furniture furniture;

    @Mock
    private Electronic electronic;

    @Mock
    private HomeApplicance homeApplicance;

    @Mock
    private LawAndGarden lawAndGarden;

    @Mock
    private MajorApplicance majorApplicance;

    @Mock
    private MinorApplicance minorApplicance;

    @Mock
    private KitchenAppliance kitchenAppliance;

    @Mock
    private GeneralAppliance generalAppliance;
    @Test
    public void defaultKeyword(){

        rootCategory = RootCategory.createObject();

        searchService = new SearchService(rootCategory);
        //Mockito.when(rootCategory.getKeyword()).thenReturn("");
        searchService.searchByKeyword("");

        Assertions.assertTrue(searchService.searchByKeyword("") instanceof RootCategory);

    }
    @Test
    public void furnitureSearch(){

        furniture = Furniture.createObject();
        searchService = new SearchService(furniture);
        searchService.searchByKeyword("furniture");

        Assertions.assertTrue(searchService.searchByKeyword("furniture") instanceof Furniture);
    }

    @Test
    public void homeApplianceSearch(){
        homeApplicance = HomeApplicance.createObject();
        searchService = new SearchService(homeApplicance);
        RootCategory homeApplicance = searchService.searchByKeyword("HomeApplicance");

        Assertions.assertTrue(homeApplicance instanceof HomeApplicance);


    }
    /*@Test
    public void lawAndGardenSearch(){
        lawAndGarden = LawAndGarden.createObject();
        searchService = new SearchService(lawAndGarden);
        final RootCategory lawAndGardenSearch = searchService.searchByKeyword("lawAndgarden");

        Assertions.assertTrue(lawAndGardenSearch instanceof LawAndGarden);
    }*/

    @Test
    public void majorSearch(){
        majorApplicance = MajorApplicance.createObject();
        searchService = new SearchService(majorApplicance);
        final RootCategory majorSearch = searchService.searchByKeyword("majorAppliance");

        Assertions.assertTrue(majorSearch instanceof MajorApplicance);
    }
    @Test
    public void minorSearch(){
        minorApplicance = MinorApplicance.createObject();
        searchService = new SearchService(minorApplicance);
        final RootCategory minorSearch = searchService.searchByKeyword("minorappliance");

        Assertions.assertTrue(minorSearch instanceof MinorApplicance);
    }

    @Test
    public void kitchenSearch(){
        kitchenAppliance = KitchenAppliance.createObject();
        searchService = new SearchService(kitchenAppliance);
        final RootCategory kitchenSearch = searchService.searchByKeyword("kitchenAppliance");

        Assertions.assertTrue(kitchenSearch instanceof KitchenAppliance);
    }
    @Test
    public void generalSearch(){
        generalAppliance = GeneralAppliance.createObject();
        searchService = new SearchService(generalAppliance);
        final RootCategory generalSearch = searchService.searchByKeyword("general");

        Assertions.assertTrue(generalSearch instanceof GeneralAppliance);
    }
}
