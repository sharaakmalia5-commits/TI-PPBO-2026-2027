
public class BangunDatarDemo {
    public static void main(String[] args) {
        // 1. Membuat array bertipe BangunDatar 5 objek
        BangunDatar[] daftarBangun = {
                new Lingkaran("Lingkaran A", 7.0),
                new Persegi("Persegi B", 5.0),
                new PersegiPanjang("Persegi Panjang C", 6.0, 4.0),
                new Lingkaran("Lingkaran D", 10.0),
                new Persegi("Persegi E", 8.5)
        };

        double totalLuas = 0;

        // melacak bangun dengan luas terbesar
        BangunDatar bangunTerbesar = daftarBangun[0];

        System.out.println("\nINFORMASI KUMPULAN BANGUN DATAR\n");

        // 2. Menampilkan info
        for (BangunDatar b : daftarBangun) {
            b.tampilkanInfo(); // Polimorfisme

            double luasCurrent = b.hitungLuas();
            totalLuas += luasCurrent;

            // Mencari luas terbesar
            if (luasCurrent > bangunTerbesar.hitungLuas()) {
                bangunTerbesar = b;
            }
        }

        // 3. Menampilkan total luas dan bangun dengan luas terbesar
        System.out.println("\nTotal Luas Seluruh Bangun : " + totalLuas);
        System.out.println("Bangun dengan Luas Terbesar :");
        System.out.println("1. Nama : " + bangunTerbesar.namaBangun);
        System.out.println("2. Luas : " + bangunTerbesar.hitungLuas());
        System.out.println("----------------------------------------");
    }
}