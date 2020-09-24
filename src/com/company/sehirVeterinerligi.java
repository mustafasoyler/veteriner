package com.company;

import java.util.ArrayList;

public class sehirVeterinerligi {
    private  String sehir;
    private  int toplamVterinerSayisi;

    private ArrayList<veteriner> sehirdekiVeterinerler;

    public sehirVeterinerligi(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler=new ArrayList<>();
        toplamVterinerSayisi=0;
    }
    public void sehirVeterinerEkle(veteriner veteriner){
        toplamVterinerSayisi++;
        sehirdekiVeterinerler.add(veteriner);
    }
    public void sehirdekiToplamVeterinerSayisiniBul(){
        System.out.println("Toplam veteriner sayısı " +sehirdekiVeterinerler.size());
    }

}
