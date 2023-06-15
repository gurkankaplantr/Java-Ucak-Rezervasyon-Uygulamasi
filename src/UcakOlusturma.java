import java.util.Random;

public class UcakOlusturma implements IUcak {
    private String model;
    private String seriNo;
    private int yolcuKapasitesi;
    private String bagajKapasitesi;
    private int hiz;
    private Random random = new Random();

    public UcakOlusturma() {
        int randomValue = random.nextInt(5);

        switch (randomValue) {
            case 0:
                model = "BOİNG711";
                seriNo = "AZ784578";
                yolcuKapasitesi = 220;
                bagajKapasitesi = "25 KG";
                hiz = 800;
                break;
            case 1:
                model = "BOİNG A300";
                seriNo = "DR456784";
                yolcuKapasitesi = 350;
                bagajKapasitesi = "20 KG";
                hiz = 830;
                break;
            case 2:
                model = "BOİNG 787";
                seriNo = "ŞÜ821478";
                yolcuKapasitesi = 300;
                bagajKapasitesi = "15 KG";
                hiz = 900;
                break;
            case 3:
                model = "ATR 72";
                seriNo = "KR145678";
                yolcuKapasitesi = 240;
                bagajKapasitesi = "15 KG";
                hiz = 1560;
                break;
            case 4:
                model = "AERO 10 S";
                seriNo = "THY478147";
                yolcuKapasitesi = 350;
                bagajKapasitesi = "10 KG";
                hiz = 1200;
                break;
            default:
                break;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeriNo() {
        return seriNo;
    }

    public void setSeriNo(String seriNo) {
        this.seriNo = seriNo;
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public String getBagajKapasitesi() {
        return bagajKapasitesi;
    }

    public void setBagajKapasitesi(String bagajKapasitesi) {
        this.bagajKapasitesi = bagajKapasitesi;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }
}
