package org.example.square.trade.model;

public class HomeApplicance extends RootCategory {

    private String type;
    private KeyboardHome keyword;
    public HomeApplicance() {
    }

    public HomeApplicance(String type, KeyboardHome keyword) {
        super(type, String.valueOf(keyword));
        this.type = type;
        this.keyword = keyword;
    }

    public static HomeApplicance createObject() {
        HomeApplicance homeApplicance = new HomeApplicance("Home Applicance", KeyboardHome.HomeApplicance);
        return  homeApplicance;
    }

    public String getType() {
        return type;
    }

    public String getKeyword() {
        return keyword.toString();
    }
}
enum KeyboardHome{
    HomeApplicance
}
