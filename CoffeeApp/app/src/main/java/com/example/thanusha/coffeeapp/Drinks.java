package com.example.thanusha.coffeeapp;

public class Drinks {

    private String name;
    private String desc;
    private int imageID;

    public static final Drinks [] drinks={
            new Drinks("Latte", "this is a description for Latte", R.drawable.coffee1),
            new Drinks("Capacino", "this is a description for Capacino", R.drawable.coffee2),
            new Drinks("Filter Coffee", "this is a description for Filter Coffee", R.drawable.coffee3),

    };
    private Drinks(String name, String des, int imageID){
        this.name=name;
        this.desc=desc;
        this.imageID=imageID;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageID() {
        return imageID;
    }

    @Override
    public String toString() {
//        return "Drinks{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                '}';
        return this.name;

    }
}
