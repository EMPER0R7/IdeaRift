package com.example.idearift;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "my_notes")
public class Note {

    private String title;

    public Note(String title, String disp, int id) {
        this.title = title;
        this.disp = disp;
        this.id = id;
    }

    private String disp;

    @PrimaryKey(autoGenerate = true)
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDisp() {
        return disp;
    }

    public void setDisp(String disp) {
        this.disp = disp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
