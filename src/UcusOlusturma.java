import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class UcusOlusturma {
    private String musteri;
    private String ucak;
    private String ucakSeriNo;
    private String bagajKapasitesi;
    private String lokasyon;
    private String tarih;
    private String saat;

    public UcusOlusturma(String ad, String soyad) {
        musteri = ad + " " + soyad;

        UcakOlusturma ucakOlusturma = new UcakOlusturma();
        ucak = ucakOlusturma.getModel();
        ucakSeriNo = ucakOlusturma.getSeriNo();
        bagajKapasitesi = ucakOlusturma.getBagajKapasitesi();

        System.out.println("\nEtkin Uçuşlar: ");
        LokasyonOlusturma lokasyonOlusturma = new LokasyonOlusturma();

        int lSayac = 1;
        for (String item : lokasyonOlusturma.LokasyonList) {
            System.out.println(lSayac + ".Konum.txt =>" + item);
            lSayac++;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Uçuş Lokasyonu Seçiniz: ");
            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= lSayac - 1) {
                lokasyon = lokasyonOlusturma.LokasyonList.get(secim - 1);
                break;
            }
        }

        while (true) {
            System.out.println("\nLütfen Tarih Giriniz (gün/ay/yıl): ");
            tarih = scanner.next();

            if (isValidDate(tarih)) {
                break;
            } else {
                System.out.println("Hatalı Tarih Formatı! Lütfen doğru biçimde giriniz (gün/ay/yıl).");
            }
        }

        // Saati rastgele oluştursun
        Random random = new Random();
        int saatSaat = random.nextInt(24); // 0-23 arasında rastgele bir saat değeri
        int saatDakika = random.nextInt(60); // 0-59 arasında rastgele bir dakika değeri
        saat = String.format("%02d:%02d", saatSaat, saatDakika); // Saat ve dakika değerlerini formatla

        scanner.close();
    }

    private boolean isValidDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public String UcusDondur() {
        Rezervasyon rezervasyon = new Rezervasyon();

        String temp = "\nSayın: " + musteri + "\nUçağınız: " + ucak + "\nUçak Seri Numaranız: " + ucakSeriNo + " \nLokasyonunuz: " + lokasyon + "\nUçuş Tarihiniz: " + tarih + "\nUçuş Saatiniz: " + saat + "\nUçak Bagaj Hakkınız: " + bagajKapasitesi + "\nBilet Tutarınız: " + rezervasyon.ucret;
        return temp;
    }
}
