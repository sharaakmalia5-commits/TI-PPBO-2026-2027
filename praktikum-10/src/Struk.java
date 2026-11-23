public class Struk implements Cetak {
    private String kodeTransaksi;
    private double total;

    public Struk(String kodeTransaksi, double total) {
        this.kodeTransaksi = kodeTransaksi;
        this.total = total;
    }

    @Override
    public void cetak() {
        System.out.println("Mencetak Struk [" + kodeTransaksi + "] - Total: Rp" + total);
    }
}