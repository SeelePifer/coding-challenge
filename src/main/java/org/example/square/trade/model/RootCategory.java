package org.example.square.trade.model;

public class RootCategory {
    private String type;
    private String keyword;

    public RootCategory(String type, String keyword) {
        this.type = type;
        this.keyword = keyword;
    }

    public RootCategory() {
    }

    public static RootCategory createObject() {
        RootCategory rootCategory = new RootCategory("root", "");
        return rootCategory;
    }

    public String getType() {
        return type;
    }

    public String getKeyword() {
        return keyword;
    }
}
