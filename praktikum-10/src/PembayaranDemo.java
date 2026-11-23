import java.util.Scanner;

// Class utama untuk pembayaran toko menggunakan polymorphism dan instanceof
public class PembayaranDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nominal belanja (di bawah 10000000): ");
        double jumlah = input.nextDouble();

        // Array bertipe superclass MetodePembayaran
        MetodePembayaran[] daftarMetode = {
                new Tunai("Tunai Kasir"),
                new Kartukredit("Kartu Kredit BCA"),
                new EWallet("GoPay"),
                new EWallet("DANA")
        };

        String metodeTerkecil = "";
        double totalBersihTerkecil = Double.MAX_VALUE;

        System.out.println("\nRINCIAN PEMBAYARAN");
        for (MetodePembayaran metode : daftarMetode) {
            // Memanggil method prosesPembayaran pakai polimorfik
            metode.prosesPembayaran(jumlah);

            double biayaAdmin = metode.hitungBiayaAdmin(jumlah);
            double cashback = 0;

            // Cek kemampuan cashback menggunakan instanceof dan casting ke BisaCashback
            if (metode instanceof BisaCashback) {
                BisaCashback cb = (BisaCashback) metode;
                cashback = cb.hitungCashback(jumlah);
                System.out.println("Cashback          : " + cashback);
            } else {
                System.out.println("Cashback          : 0.0 (Tidak tersedia)");
            }

            double totalBersih = jumlah + biayaAdmin - cashback;
            System.out.println("Total Bersih      : " + totalBersih);

            // Menentukan metode pembayaran dengan total bersih
            if (totalBersih < totalBersihTerkecil) {
                totalBersihTerkecil = totalBersih;
                metodeTerkecil = metode.namaMetode;
            }
        }
        System.out.println("Metode dengan total bersih paling kecil: " + metodeTerkecil +
                " (" + totalBersihTerkecil + ")");
        input.close();
    }
}