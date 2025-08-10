package com.creational.pattern.builder.solution;

public class WithBuilderPattern {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Concrete", "Wooden", "Tile")
                .setGarden(true)
                .setSwimmingPool(true)
                .setGarage(false)
                .build();

        System.out.println(house);
    }
}
