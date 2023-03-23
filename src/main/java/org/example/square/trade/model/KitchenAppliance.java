package org.example.square.trade.model;

public final class KitchenAppliance extends MajorApplicance {

    private String type;
    private KeywordMayor keyword;

    public KitchenAppliance(String type, KeywordMayor keyword) {
        super(type, keyword);
        this.type = type;
        this.keyword = keyword;
    }

    public KitchenAppliance(String type, KeyboardHome keyword, String type1, KeywordMayor keyword1, String type2, KeywordMayor keyword2) {
        super(type, keyword, type1, keyword1);
        this.type = type2;
        this.keyword = keyword2;
    }

    public static KitchenAppliance createObject(){
        KitchenAppliance kitchenAppliance = new KitchenAppliance("kitchenAppliance", KeywordMayor.kitchenAppliance);
        return kitchenAppliance;

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getKeyword() {
        return keyword.toString();
    }
}
