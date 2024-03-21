package P5.Latihan;

public class Main26 {
    public static void main(String[] args) {

        Mobil26[] jnsMobil = {
                new Mobil26("BMW", "M2 coupe", 2016, 6816, 728),
                new Mobil26("Ford", "Fiesta ST", 2014, 3921, 575),
                new Mobil26("Nissan", "370Z", 2009, 4360, 657),
                new Mobil26("Subaru", "BRZ", 2014, 4058, 609),
                new Mobil26("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Mobil26("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Mobil26("Toyota", "86/GT86", 2014, 4180, 609),
                new Mobil26("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        Showroom26 showroom = new Showroom26(jnsMobil);

        System.out.println("==============================================================================");
        System.out.printf("| %-12s | %-18s | %-6s | %-17s | %-9s |\n", "Brand", "Type", "Year", "Top Acceleration",
                "Top Power");
        System.out.println("==============================================================================");
        for (Mobil26 NamMobil : jnsMobil) {
            System.out.printf("| %-12s | %-18s | %-6d | %-17d | %-9d |\n", NamMobil.Merk, NamMobil.Tipe, NamMobil.Tahun,
                    NamMobil.topAcceleration, NamMobil.topPower);
        }
        System.out.println("==============================================================================");

        // Hasil dari top_acceleration tertinggi menggunakan Divide and Conquer
        int highestAcceleration = showroom.TopAccelerationTertinggi(0, jnsMobil.length - 1);
        System.out.println("Top acceleration tertinggi  : " + highestAcceleration);
        System.out.println();
        // Hasil dari top_acceleration terendah menggunakan Divide and Conquer
        int lowestAcceleration = showroom.TopAccelerationTerendah(0, jnsMobil.length - 1);
        System.out.println("Top acceleration terendah   : " + lowestAcceleration);
        System.out.println();

        System.out.println("==============================================================================");
    }
}
