import java.util.Scanner;

public class MusteriOlusturma {
    private String Ad;
    private String Soyad;
    private String Yas;
    private String KimlikNo;
    private String IletisimNo;
    private int Cinsiyet;
    private int Engelli;

    public Musteri musteri() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Adınızı Giriniz: ");
        Ad = scanner.nextLine();

        System.out.print("Lütfen Soyadınızı Giriniz: ");
        Soyad = scanner.nextLine();

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        Yas = scanner.nextLine();

        while (true) {
            System.out.print("Lütfen TC Kimlik Numaranızı Giriniz (11 haneli rakamlar): ");
            KimlikNo = scanner.nextLine();

            if (KimlikNo.matches("\\d{11}")) {
                break;
            } else {
                System.out.println("Hatalı Değer! TC Kimlik Numarası 11 haneli rakamlardan oluşmalıdır.");
            }
        }

        System.out.print("Lütfen İletişim Numaranızı Başında Sıfır Olmadan Giriniz: ");
        IletisimNo = scanner.nextLine();

        while (true) {
            String Temp;

            System.out.print("Lütfen Cinsiyetinizi Giriniz (Erkek = E / Kadın = K ): ");
            Temp = scanner.nextLine();

            if (Temp.equals("E")) {
                Cinsiyet = 1;
                break;
            } else if (Temp.equals("K")) {
                Cinsiyet = 2;
                break;
            } else {
                System.out.println("Hatalı Değer");
            }
        }

        while (true) {
            String Temp;

            System.out.print("Engel Durumunuz Var mı?(Evet = E / Hayır = H): ");
            Temp = scanner.nextLine();

            if (Temp.equals("E")) {
                Engelli = 1;
                break;
            } else if (Temp.equals("H")) {
                Engelli = 2;
                break;
            } else {
                System.out.println("Hatalı Değer");
            }
        }

        Musteri musteri = new Musteri(Ad, Soyad, Yas, KimlikNo, IletisimNo, Cinsiyet, Engelli);

        return musteri;
    }
}
