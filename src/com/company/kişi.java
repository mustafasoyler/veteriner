package com.company;

abstract public class kişi {
    private String isim;
    private String TcKimlik;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTcKimlik() {
        return TcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        TcKimlik = tcKimlik;
    }

    public kişi(String isim, String tcKimlik) {
        this.isim = isim;
        TcKimlik = tcKimlik;
    }
    abstract void kendiniTanit();


    @Override
    public String toString() {
        return "kişi{" +
                "isim='" + isim + '\'' +
                ", TcKimlik='" + TcKimlik + '\'' +
                '}';
    }
}


