import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double Tarif_450 = 415.0;
        final double Tarif_900 = 1352.0;
        final double Tarif_1300 = 1444.70;
        final double Tarif_2200 = 1444.70;
        final double Tarif_Diatas_2200 = 1699.53;

        System.out.println("\n\nPERHITUNGAN TARIF LISTRIK\n");
        System.out.println("Pilihan Golongan Daya: 450, 900, 1300, 2200, atau 3500 (di atas 2200");
        System.out.print("Masukkan golongan daya (VA) : ");
        int daya = scanner.nextInt();

        System.out.print("Masukkan jumlah pemakaian (kWh): ");
        double kwh = scanner.nextInt();

        if (kwh <= 0) {
            System.out.println("Error: jumlah pemakaian tidak valid, harus lebih dari 0.");
        } else {
            double tarifPerKwh = 0;
            String namaGolongan = "";

            switch (daya) {
                case 450:
                    tarifPerKwh = Tarif_450;
                    namaGolongan = "450 VA";
                    break;
                case 990:
                    tarifPerKwh = Tarif_900;
                    namaGolongan = "900 VA";
                    break;
                case 1300:
                    tarifPerKwh = Tarif_1300;
                    namaGolongan = "1300 VA";
                    break;
                case 2200:
                    tarifPerKwh = Tarif_2200;
                    namaGolongan = "2200 VA";
                    break;
                default:
                    if (daya > 2200) {
                        tarifPerKwh = Tarif_Diatas_2200;
                        namaGolongan = "> 2200 VA (" + daya + "VA)";
                    } else {
                        namaGolongan = "Tidak Valid";
                    }
                    break;
            }
            if (namaGolongan.equals("Tidak Valid")) {
                System.out.println("Error: Golongan daya tidak dikenali");
            } else {

                double totalTagihan = kwh * tarifPerKwh;

                System.out.println("\nSTRUK TAGIHAN LISTRIK\n");
                System.out.println("Golongan Daya : " + namaGolongan);
                System.out.println("Jumlah Pemakaian : " + kwh + " kWh");
                System.out.printf("Tarif per kWh : Rp %,.2f\n", tarifPerKwh);
                System.out.println("-----------------");
                System.out.printf("Total Tagihan : Rp %,.2f\n", totalTagihan);
            }
        }
        scanner.close();
    }
}

