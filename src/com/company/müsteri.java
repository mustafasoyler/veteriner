package com.company;

import java.util.ArrayList;

public class müsteri extends kişi {
    private String adres;
    private ArrayList<hayvan> musteriHayvanlari;

    public müsteri(String isim, String tcKimlik,String adres) {
        super(isim, tcKimlik);
        this.adres=adres;
        musteriHayvanlari=new ArrayList<>();
    }
    public void musteriyeHayvanEklr(hayvan hayvan){
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan + " " +getIsim() +  " müşterisine eklendi.");
    }
    public void musteriHayvanlariListele(){
        for (hayvan h :musteriHayvanlari){
            System.out.println(h);
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString() + " Ben bir müşteriyim.");
    }

    @Override
    public String toString() {
        return super.toString() +"müsteri{" +
                "adres='" + adres + '\'' +
                '}';
    }
}
