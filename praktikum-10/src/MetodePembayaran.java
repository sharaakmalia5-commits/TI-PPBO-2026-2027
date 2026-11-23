// Abstract class induk untuk berbagai metode pembayaran toko
public abstract class MetodePembayaran {
    protected String namaMetode;

    public MetodePembayaran(String namaMetode) {
        this.namaMetode = namaMetode;
    }

    // Method abstract
    public abstract double hitungBiayaAdmin(double jumlah);

    // Method biasa
    public void prosesPembayaran(double jumlah) {
        double biayaAdmin = hitungBiayaAdmin(jumlah);
        double totalBayar = jumlah + biayaAdmin;

        System.out.println("Metode Pembayaran : " + namaMetode);
        System.out.println("Jumlah Belanja    : " + jumlah);
        System.out.println("Biaya Admin       : " + biayaAdmin);
        System.out.println("Total Bayar       : " + totalBayar);
    }
}