package alisveris;

public class Urun {
    private int urunNo;
    private String urunIsim;
    private double urunFiyat;
    private static int urunSayisi=0;

    public int getUrunNo() {
        return urunNo;
    }

    public void setUrunNo(int urunNo) {
        this.urunNo = urunNo;
    }

    public String getUrunIsim() {
        return urunIsim;
    }

    public void setUrunIsim(String urunIsim) {
        this.urunIsim = urunIsim;
    }

    public double getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(double urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public Urun(int urunNo, String urunIsim, double urunFiyat) {
        this.urunNo = urunNo;
        this.urunIsim = urunIsim;
        this.urunFiyat = urunFiyat;

    }

    @Override
    public String toString() {
        return "Urun{" +
                "urunNo=" + urunNo +
                ", urunIsim='" + urunIsim + '\'' +
                ", urunFiyat=" + urunFiyat +
                '}';
    }
}