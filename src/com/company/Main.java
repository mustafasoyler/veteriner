package com.company;

public class Main {

    public static void main(String[] args) {

            ilkNesneleriOlustur();
    }

    private static void ilkNesneleriOlustur() {
        kedi kedi=new kedi("01-01-2017",true,"Van Kedisi");
        kedi kedi1 =new kedi("01-02-2017",false,"Siyam");
        kedi kedi2=new kedi("01-03-2017",true,"Tekir");

        köpek köpek=new köpek("01-01-2016",true,1,"Golden");
        köpek köpek1=new köpek("01-02-2016",true,2,"Dalmaçyalı");
        köpek köpek2=new köpek("01-03-2016",true,4,"Pitbull");

        müsteri m1=new müsteri("Ali","123","Ankara");
        m1.musteriyeHayvanEklr(kedi);
        m1.musteriyeHayvanEklr(köpek);

        müsteri m2=new müsteri("Mustafa","456","Konya");
        m2.musteriyeHayvanEklr(kedi1);
        m2.musteriyeHayvanEklr(köpek1);

        müsteri m3=new müsteri("Veli","789","İzmir");
        m3.musteriyeHayvanEklr(kedi2);
        m3.musteriyeHayvanEklr(köpek2);

         veteriner v1=new veteriner("Süleyman","111","Ege",1);
         v1.musteriEkle(m1);
         v1.musteriEkle(m2);

        veteriner v2=new veteriner("Fevzi","222","Ankara",2);
        v2.musteriEkle(m1);
        v2.musteriEkle(m3);

        veteriner v3=new veteriner("Hasan","333","Bursa",3);
        v3.musteriEkle(m3);

        v1.müsterileriListele();

        sehirVeterinerligi ankara=new sehirVeterinerligi("Ankara");
        ankara.sehirVeterinerEkle(v1);
        ankara.sehirVeterinerEkle(v2);

        sehirVeterinerligi izmir=new sehirVeterinerligi("İzmir");
        izmir.sehirVeterinerEkle(v3);

        ankara.sehirdekiToplamVeterinerSayisiniBul();
        izmir.sehirdekiToplamVeterinerSayisiniBul();

        System.out.println("Yönetim Paneli");
        yönetimPaneli<hayvan> hayvanyönetimPaneli =new yönetimPaneli<>();
        hayvanyönetimPaneli.bilgileriGoster(kedi);
        hayvanyönetimPaneli.bilgileriGoster(köpek);

        yönetimPaneli<müsteri>müsteriyönetimPaneli =new yönetimPaneli<>();
        müsteriyönetimPaneli.bilgileriGoster(m1);
        müsteriyönetimPaneli.sahipOlduguHayvanlarıGoster(m1);


    }

}
