package com.example.week2;

public class User {
    private String name;
    private String description;
    private int id;
    private boolean followed;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDesc) {
        this.description = newDesc;
    }

    public int getId() {
        return description;
    }

    public void setId(int newId) {
        this.id = newId
    }

    public boolean getFollowed() {
        return followed;
    }

    public void setFollowed(boolean newFollow) {
        this.followed = newFollow
    }
}
}
