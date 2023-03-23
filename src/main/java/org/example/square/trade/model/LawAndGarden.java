package org.example.square.trade.model;

public final class LawAndGarden extends HomeApplicance {

    private String type;
    private KeywordLawAndGarden keyword;
    public LawAndGarden() {
    }

    public LawAndGarden(String type, KeywordLawAndGarden keyword) {
        this.type = type;
        this.keyword = keyword;
    }

    public LawAndGarden(String type, KeyboardHome keyword, String type1, KeywordLawAndGarden keyword1) {
        super(type, keyword);
        this.type = type1;
        this.keyword = keyword1;
    }

    public static LawAndGarden createObject(){
        LawAndGarden lawAndGarden = new LawAndGarden("law&garden", KeywordLawAndGarden.lawAndgarden);
        return lawAndGarden;
    }
}
enum KeywordLawAndGarden{
    lawAndgarden
}
