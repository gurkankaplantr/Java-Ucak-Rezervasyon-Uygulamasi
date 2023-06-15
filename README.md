# Java-Ucak-Rezervasyon-Uygulamasi
"Lokasyon.txt" dosyasını silmeyiniz, veriler bu dosyadan çekilmektedir.
Proje Eclipse IDE - 2023 03 versiyonu ve JavaSE-19 kullanılarak hazırlanmıştır.
Uygulama başlatıldığında müşteri bilgilerini (Kimlik Numarası, ad, soyad, telefon numarası, cinsiyet, engelli durumu) istemektedir.
Kimlik Numarası ve Telefon Numarası 11 haneli olduğu için uygulamada belirtilen alanlara 11 haneli sayı girilmesi gerekmektedir.
Müşteri bilgilerinden sonra lokasyon seçimi yapılır.
Lokasyon seçiminden sonra tarih seçimi yapılır.
Saat random olarak verilmektedir.

ILokasyon clası -> Lokasyon bilgilerini tutan arabirimdir.
IUcak clası -> Ucak bilgilerini tutan arabirimdir.
LokasyonOlustur sınıfı -> "Lokasyon.txt" belgesinden verileri okumak ve lokasyon listesi oluşturmak için kullanılır.
Program clası -> Projenin root sınıfıdır.
Musteri sınıfı -> Müşteri bilgi alanlarını tutan sınıftır.
MusteriOlustur sınıfı -> Müşteri bilgilerini almak ve gerekli alanlara aktarmak için kullanılır.
Rezervasyon sınıfı -> Ucret bilgisini oluşturur ve ücret bilgisini tutar.
UcakOlustur -> Rastgele sayı belirlenir ve belirlenen sayıya göre bir uçak oluşturulur.
UcusOlustur sınıfı -> Asıl sınıftır. Tüm bilgilerin alınması için kullanılır.
