package org.example.square.trade.model;

public final class MinorApplicance extends HomeApplicance{

    private String type;
    private KeywordMinor keyword;

    public MinorApplicance(String type, KeywordMinor keyword) {
        this.type = type;
        this.keyword = keyword;
    }

    public MinorApplicance(String type, KeyboardHome keyword, String type1, KeywordMinor keyword1) {
        super(type, keyword);
        this.type = type1;
        this.keyword = keyword1;
    }

    public static MinorApplicance createObject(){
        MinorApplicance minorApplicance = new MinorApplicance("minorappliance", KeywordMinor.minorappliance);
        return minorApplicance;
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
enum KeywordMinor {
    minorappliance
}
