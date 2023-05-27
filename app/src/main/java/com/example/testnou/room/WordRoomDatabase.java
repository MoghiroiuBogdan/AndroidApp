package com.example.testnou.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Word.class}, version = 2, exportSchema = false)
public abstract class WordRoomDatabase extends RoomDatabase {
    public abstract WordDao wordDao();

    private static volatile WordRoomDatabase INSTANCE;

    static WordRoomDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (WordRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            WordRoomDatabase.class, "dictionary").build();
                }
            }
        }
        return INSTANCE;
    }

    static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(4);
}
