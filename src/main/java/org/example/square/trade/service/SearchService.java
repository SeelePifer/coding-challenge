package org.example.square.trade.service;

import org.example.square.trade.model.*;

public final class SearchService {

    private RootCategory rootCategory;
    private Furniture furniture;
    private HomeApplicance homeApplicance;

    private LawAndGarden lawAndGarden;

    private MajorApplicance majorApplicance;

    private MinorApplicance minorApplicance;

    private KitchenAppliance kitchenAppliance;

    private GeneralAppliance generalAppliance;

    public SearchService(){}
    public SearchService(RootCategory rootCategory, Furniture furniture, HomeApplicance homeApplicance, LawAndGarden lawAndGarden, MajorApplicance majorApplicance, MinorApplicance minorApplicance, KitchenAppliance kitchenAppliance, GeneralAppliance generalAppliance) {
        this.rootCategory = rootCategory;
        this.furniture = furniture;
        this.homeApplicance = homeApplicance;
        this.lawAndGarden = lawAndGarden;
        this.majorApplicance = majorApplicance;
        this.minorApplicance = minorApplicance;
        this.kitchenAppliance = kitchenAppliance;
        this.generalAppliance = generalAppliance;
    }

    public RootCategory searchByKeyword(String s) {
        if(rootCategory.getKeyword().equals(s)){
            return rootCategory;
        }
        if(furniture.getKeyword().equals(s)){
            return furniture;
        }
        if(homeApplicance.getKeyword().equals(s)){
            return homeApplicance;
        }
        if(lawAndGarden.getKeyword().equals(s)){
            return lawAndGarden;
        }
        if(majorApplicance.getKeyword().equals(s)){
            return majorApplicance;
        }
        if(minorApplicance.getKeyword().equals(s)){
            return minorApplicance;
        }
        if(kitchenAppliance.getKeyword().equals(s)){
            return kitchenAppliance;
        }
        if(generalAppliance.getKeyword().equals(s)){
            return generalAppliance;
        }
        return null;
    }
}
