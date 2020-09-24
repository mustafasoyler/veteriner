package com.company;

public class yönetimPaneli <T>{

    public void bilgileriGoster(T nesne){
        System.out.println(nesne);
    }
    public <T extends müsteri> void sahipOlduguHayvanlarıGoster(T musteri){
        musteri.musteriHayvanlariListele();
    }


}
