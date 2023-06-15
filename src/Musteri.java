public class Musteri {
    private String Ad;
    private String Soyad;
    private String Yas;
    private String KimlikNo;
    private String IletisimNo;
    private int Cinsiyet;
    private int Engelli;

    public Musteri(String ad, String soyad, String yas, String kimlikNo, String iletisimNo, int cinsiyet, int engelli) {
        Ad = ad;
        Soyad = soyad;
        Yas = yas;
        KimlikNo = kimlikNo;
        IletisimNo = iletisimNo;
        Cinsiyet = cinsiyet;
        Engelli = engelli;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public String getYas() {
        return Yas;
    }

    public void setYas(String yas) {
        Yas = yas;
    }

    public String getKimlikNo() {
        return KimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        KimlikNo = kimlikNo;
    }

    public String getIletisimNo() {
        return IletisimNo;
    }

    public void setIletisimNo(String iletisimNo) {
        IletisimNo = iletisimNo;
    }

    public int getCinsiyet() {
        return Cinsiyet;
    }

    public void setCinsiyet(int cinsiyet) {
        Cinsiyet = cinsiyet;
    }

    public int getEngelli() {
        return Engelli;
    }

    public void setEngelli(int engelli) {
        Engelli = engelli;
    }
}
