package com.example.testnou.room;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "words")
public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "theWord")
    private String trip_name;
    @ColumnInfo(name = "theTrip")
    private String destiantion;
    @ColumnInfo(name = "thePrice")
    private String price;

    public Word(@NonNull String trip_name, String destiantion, String price) {
        this.trip_name = trip_name;
        this.destiantion = destiantion;
        this.price = price;
    }

    @NonNull
    public String getTrip_name() {
        return trip_name;
    }

    public String getDestiantion() {
        return destiantion;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "trip_name='" + trip_name + '\'' +
                ", destiantion='" + destiantion + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
