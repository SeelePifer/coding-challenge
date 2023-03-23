package org.example.square.trade.model;

public final class Furniture extends RootCategory implements KeywordsEngine{
    private String keyword;
    private String type;

    public Furniture(String keyword, String type) {
        this.keyword = keyword;
        this.type = type;
    }

    public Furniture() {
    }

    public static Furniture createObject() {
        Furniture furniture = new Furniture("furniture", "furniture");
        return furniture;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getType() {
        return type;
    }
}
