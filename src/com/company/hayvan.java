package com.company;

abstract public class hayvan {

    private String dogumTarihi;
    private boolean kayitli;

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public boolean isKayitli() {
        return kayitli;
    }

    public void setKayitli(boolean kayitli) {
        this.kayitli = kayitli;
    }

    public hayvan(String dogumTarihi, boolean kayitli) {
        this.dogumTarihi = dogumTarihi;
        this.kayitli = kayitli;
    }
    abstract void bilgileriGoster();

    @Override
    public String toString() {
        return "hayvan{" +
                "dogumTarihi='" + dogumTarihi + '\'' +
                ", kayitli=" + kayitli +
                '}';
    }
}
