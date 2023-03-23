package org.example.square.trade.service;

import org.example.square.trade.model.*;

public final class SearchService {

    private  KeywordsEngine rootCategory;
    private Furniture furniture;
    private HomeApplicance homeApplicance;

    private LawAndGarden lawAndGarden;

    private MajorApplicance majorApplicance;

    private MinorApplicance minorApplicance;

    private KitchenAppliance kitchenAppliance;

    private GeneralAppliance generalAppliance;

    public SearchService(KeywordsEngine rootCategory) {
        this.rootCategory = rootCategory;
    }

    public SearchService(Furniture furniture) {
        this.furniture = furniture;
    }

    public SearchService(HomeApplicance homeApplicance) {
        this.homeApplicance = homeApplicance;
    }

    public SearchService(LawAndGarden lawAndGarden) {
        this.lawAndGarden = lawAndGarden;
    }

    public SearchService(MajorApplicance majorApplicance) {
        this.majorApplicance = majorApplicance;
    }

    public SearchService(MinorApplicance minorApplicance) {
        this.minorApplicance = minorApplicance;
    }

    public SearchService(KitchenAppliance kitchenAppliance) {
        this.kitchenAppliance = kitchenAppliance;
    }

    public SearchService(GeneralAppliance generalAppliance) {
        this.generalAppliance = generalAppliance;
    }

    public RootCategory searchByKeyword(String s) {

        if (rootCategory != null && rootCategory.getKeyword().equals(s)) {
            return (RootCategory) rootCategory;
        }
        if (furniture != null && furniture.getKeyword().equals(s)) {
            return furniture;
        }

        if (homeApplicance != null && homeApplicance.getKeyword().equals(s)) {
            return homeApplicance;
        }

        if (lawAndGarden != null && lawAndGarden.getKeyword().equals(s)) {
            return lawAndGarden;
        }

        if (majorApplicance != null && majorApplicance.getKeyword().equals(s)) {
            return majorApplicance;
        }

        if (minorApplicance != null && minorApplicance.getKeyword().equals(s)) {
            return minorApplicance;
        }

        if (kitchenAppliance != null && kitchenAppliance.getKeyword().equals(s)) {
            return kitchenAppliance;
        }

        if (generalAppliance != null && generalAppliance.getKeyword().equals(s)) {
            return generalAppliance;
        }

        return null;
    }
}
