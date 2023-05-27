package com.example.testnou.recyclerView;

public class Trips {
    String heading;
    int image;

    public Trips(String description, int image) {
        this.heading = description;
        this.image = image;
    }

    public int getImage() {
        return image;
    }
}
