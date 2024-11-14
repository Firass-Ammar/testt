package org.example;

public class user {
    private int id;

    public user(int id, int tel, String name) {
        this.id = id;
        this.tel = tel;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int tel;
    private String name;
}