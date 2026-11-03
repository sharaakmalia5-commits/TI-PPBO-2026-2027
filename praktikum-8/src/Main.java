public class Main {
        public static void main(String[] args) {
            // Test Latihan 1
            System.out.println("LATIHAN 1: HEWAN");
            Kucing kucingku = new Kucing("Milly");
            Anjing anjingku = new Anjing("Pichy");
            System.out.println("Nama Kucing : " + kucingku.nama);
            System.out.println("Suaranya    : Miaw ");
            kucingku.bersuara();
            System.out.println("Nama Anjing : " + anjingku.nama);
            System.out.println("Suaranya    : Gukk Gukk ");
            anjingku.bersuara();

            // Test Latihan 2, 3, dan 4
            System.out.println("\nLATIHAN 2, 3, dan 4: KENDARAAN, MOBIL, MOTOR");
            Mobil mobilku = new Mobil("Mini Cooper", 207, 4);
            mobilku.tampilkanInfo();

            System.out.println();
            Motor motorku = new Motor("Vespa", 110, "Matic");
            motorku.tampilkanInfo();

            // Test Latihan 5
            System.out.println("\nLATIHAN 5: AKUN dan AKUN PREMIUM");
            AkunPremium akunVIP = new AkunPremium("shara_akmalia", 15000000.0, 1000000.0);
            akunVIP.cekLimit();
        }
    }

