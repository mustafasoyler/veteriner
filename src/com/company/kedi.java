package com.company;

public class kedi extends hayvan{

    private String tur;
    private String cinsi;

    public kedi(String dogumTarihi, boolean kayitli,String cinsi) {
        super(dogumTarihi, kayitli);
        this.tur="Kedi";
        this.cinsi=cinsi;

    }

    @Override
    void bilgileriGoster() {

        System.out.println(toString() + "kayıtlı mı " + isKayitli() +"doğum tarihi " +getDogumTarihi());
    }

    @Override
    public String toString() {
        return "kedi{" +
                "tur='" + tur + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
