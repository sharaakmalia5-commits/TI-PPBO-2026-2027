// Subclass metode pembayaran e-wallet dengan admin tetap 1000 dan cashback 5% (maks 20000)
public class EWallet extends MetodePembayaran implements BisaCashback {
    public EWallet(String namaMetode) {
        super(namaMetode);
    }

    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 1000;
    }

    @Override
    public double hitungCashback(double jumlah) {
        double cashback = 0.05 * jumlah;
        return Math.min(cashback, 20000);
    }
}