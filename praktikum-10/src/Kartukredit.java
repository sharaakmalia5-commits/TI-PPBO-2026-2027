// Subclass metode pembayaran kartu kredit dengan admin 2% dan cashback 1%
public class Kartukredit extends MetodePembayaran implements BisaCashback {
    public Kartukredit(String namaMetode) {
        super(namaMetode);
    }

    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 0.02 * jumlah;
    }

    @Override
    public double hitungCashback(double jumlah) {
        return 0.01 * jumlah;
    }
}