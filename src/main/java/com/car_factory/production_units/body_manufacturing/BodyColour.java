package com.car_factory.production_units.body_manufacturing;

public enum BodyColour {
    RED("RED"),GREEN("GREEN"),WHITE("WHITE"),ORANGE("ORANGE"),BLACK("BLACK"),BLUE("BLUE"),SILVER("SILVER"),
    PRIMER_PAINTING("PRIMER PAINTING");

    private String colour;

    BodyColour(String colour) {
        this.colour = colour;

    }

    public String getColour() {
        return colour;
    }
}
