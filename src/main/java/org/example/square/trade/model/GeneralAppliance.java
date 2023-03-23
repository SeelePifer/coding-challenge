package org.example.square.trade.model;

public final class GeneralAppliance extends MajorApplicance {
    private String type;
    private KeywordMayor keyword;

    public GeneralAppliance(String type, KeywordMayor keyword) {
        super(type, keyword);
        this.type = type;
        this.keyword = keyword;
    }

    public GeneralAppliance(String type, KeyboardHome keyword, String type1, KeywordMayor keyword1, String type2, KeywordMayor keyword2) {
        super(type, keyword, type1, keyword1);
        this.type = type2;
        this.keyword = keyword2;
    }

    public static GeneralAppliance createObject() {
        GeneralAppliance generalAppliance = new GeneralAppliance("general", KeywordMayor.general);
        return  generalAppliance;
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
