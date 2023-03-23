package org.example.square.trade.model;

public final class Electronic extends RootCategory{

    private String type = "Electronic";
    private KeywordElectronic keyword;

    public Electronic(KeywordElectronic keyword, String type) {
        this.keyword = keyword;
        this.type = type;
    }

    public Electronic(){}
    public static Electronic createObject() {
        Electronic electronic = new Electronic(KeywordElectronic.ELECTRONIC, "Electronic");
        return  electronic;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getKeyword() {
        return KeywordElectronic.ELECTRONIC.toString();
    }
}
enum KeywordElectronic {
    ELECTRONIC, ELEC, electronic, elec
}