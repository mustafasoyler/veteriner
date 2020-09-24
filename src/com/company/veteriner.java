package com.company;

import java.util.ArrayList;

public class veteriner extends kişi{

    private String mezunOlduguOkul;
    private int calismaSüresi;
    private ArrayList<müsteri> veterinerMusterileri;
    private int müsteriSayisi;


    public veteriner(String isim, String tcKimlik,String mezunOlduguOkul,int calismaSüresi) {
        super(isim, tcKimlik);
        this.mezunOlduguOkul=mezunOlduguOkul;
        this.calismaSüresi=calismaSüresi;
        veterinerMusterileri=new ArrayList<>();
        müsteriSayisi=0;

    }
    public void musteriEkle(müsteri müsteri){
        veterinerMusterileri.add(müsteri);
        müsteriSayisi++;

    }
    public void müsterileriListele(){
        for (müsteri m : veterinerMusterileri){
            m.kendiniTanit();
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(toString() + "Ben bir veterinerim.");
    }

    @Override
    public String toString() {
        return super.toString() + "veteriner{" +
                "mezunOlduguOkul='" + mezunOlduguOkul + '\'' +
                ", calismaSüresi=" + calismaSüresi +
                '}';
    }
}
