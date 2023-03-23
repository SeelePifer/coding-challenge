package org.example.square.trade.model;

public class MajorApplicance extends HomeApplicance{
    private String type;
    private KeywordMayor keyword;

    public MajorApplicance(String type, KeywordMayor keyword) {
        this.type = type;
        this.keyword = keyword;
    }

    public MajorApplicance(String type, KeyboardHome keyword, String type1, KeywordMayor keyword1) {
        super(type, keyword);
        this.type = type1;
        this.keyword = keyword1;
    }

    public static MajorApplicance createObject(){

        MajorApplicance majorApplicance = new MajorApplicance("majorAppliance", KeywordMayor.majorAppliance);
        return majorApplicance;
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
enum KeywordMayor{
    majorAppliance, general, kitchenAppliance
}
