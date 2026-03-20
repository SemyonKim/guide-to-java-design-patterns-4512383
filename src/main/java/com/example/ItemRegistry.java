package com.example;

public class ItemRegistry {

    public static void main(String[] args) {

        var item1 = new StoreItem.Builder("Broccoli", 45.)
        .shortDescription("vegie")
        .longDescription("good for health")
        .build();

        var item2 = new StoreItem.Builder("Cucumber", 25.)
        .longDescription("mostly water")
        .packagingType("open box")
        .build();

        addToItemRegistry(item1);
        addToItemRegistry(item2);
    }

    private static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }

}
