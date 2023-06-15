import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UÇAK REZERVASYON SİSTEMİ");
        System.out.println("###########################################################");
        System.out.println("KURUMUMUZ TÜRK HAVA YOLLARI TARAFINDAN FİNANSE EDİLMEKTEDİR");
        System.out.println("###########################################################\n");
        System.out.println("######################################################");
        System.out.println("SAYIN YOLCUMUZ UÇAK REZERVASYON SİSTEMİNE HOŞGELDİNİZ.");
        System.out.println("######################################################\n");
        System.out.println("##############################################");
        System.out.println("KURUMUMUZ %100 BİLGİ GÜVENLİĞİ SAĞLAMAKTADIR.");
        System.out.println("##############################################\n");

        MusteriOlusturma musteriOlusturma = new MusteriOlusturma();
        Musteri musteri = musteriOlusturma.musteri();

        UcusOlusturma ucusOlusturma = new UcusOlusturma(musteri.getAd(), musteri.getSoyad());
        System.out.print(ucusOlusturma.UcusDondur());
        System.out.print("\n\n########################################");
        System.out.print("\n SAYIN YOLCUMUZ İYİ UÇUŞLAR DİLERİM.\n");
        System.out.print("###########################################\n");

        Thread.sleep(1000);
    }
}
