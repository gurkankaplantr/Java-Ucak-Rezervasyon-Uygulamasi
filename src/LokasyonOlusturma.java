import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

interface ILokasyon {
}

public class LokasyonOlusturma implements ILokasyon {
    public String Ulke;
    public String Sehir;
    public String Havalimani;
    public List<String> LokasyonList = new ArrayList<>();

    private String FilePath = "Konum.txt";
    private String TLokasyon = "";

    public LokasyonOlusturma() {
        File file = new File(FilePath);

        if (file.exists()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String satir;

                while ((satir = reader.readLine()) != null) {
                    String[] Dlist = satir.split(",");

                    Ulke = Dlist[0];
                    Sehir = Dlist[1];
                    Havalimani = Dlist[2];

                    TLokasyon = Ulke + " - " + Sehir + " - " + Havalimani;
                    LokasyonList.add(TLokasyon);
                }

                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Ulke = "Türkiye";
            Sehir = "Kars";
            Havalimani = "Harakani Havalimanı";

            TLokasyon = Ulke + " - " + Sehir + " - " + Havalimani;
            LokasyonList.add(TLokasyon);
        }
    }
}


