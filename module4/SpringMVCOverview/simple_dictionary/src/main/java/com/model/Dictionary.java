package com.model;

public class Dictionary {
    private String eng;
    private String vnd;

    public Dictionary(String eng, String vnd) {
        this.eng = eng;
        this.vnd = vnd;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getVnd() {
        return vnd;
    }

    public void setVnd(String vnd) {
        this.vnd = vnd;
    }
}
