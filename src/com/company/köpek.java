package com.company;

public class köpek extends hayvan {

    private  int asiSayisi;
    private  String tur;
    private  String cinsi;

    public köpek(String dogumTarihi, boolean kayitli,int asiSayisi,String cinsi) {
        super(dogumTarihi, kayitli);
        this.asiSayisi=asiSayisi;
        this.tur="Köpek";
        this.cinsi=cinsi;
    }

    @Override
    void bilgileriGoster() {
        System.out.println(toString()+ " " +super.toString());

    }

    public int getAsiSayisi() {
        return asiSayisi;
    }

    public void setAsiSayisi(int asiSayisi) {
        this.asiSayisi = asiSayisi;
    }

    @Override
    public String toString() {
        return "köpek{" +
                "asiSayisi=" + asiSayisi +
                '}';
    }
}
