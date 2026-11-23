public class CetakDemo {
    public static void main(String[] args) {
        Cetak[] dokumen = {
                new Laporan("Rekap Praktikum PPBO"),
                new Struk("INV-101", 75000)
        };

        for (Cetak item : dokumen) {
            item.cetak();
        }
    }
}