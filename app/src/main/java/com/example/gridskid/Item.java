package com.example.gridskid;

public class Item {
    public int id;
    public int imageID;
    String description;


    public Item (String description, int imageID){
        //this.id = id;
        this.imageID = imageID;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
