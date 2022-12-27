package com.example.androidhf07;

public class allat {

    protected int image;
    protected String nev;
    protected String szoveg;

    public allat(int image, String nev, String szoveg) {
        this.image = image;
        this.nev = nev;
        this.szoveg = szoveg;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }
}
