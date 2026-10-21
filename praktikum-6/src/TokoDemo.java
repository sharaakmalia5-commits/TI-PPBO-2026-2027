public class TokoDemo {
    public static void main(String[] args) {
        // Sesuaikan nama class-nya menjadi ProdukTugas (atau sesuaikan dengan isi file produkmu)
        ProdukTugas[] daftarProduk = {
                new ProdukTugas("P001", "Laptop ASUS ROG", 15000000, 5),
                new ProdukTugas("P002", "Mouse Wireless Logitech", 250000, 15),
                new ProdukTugas("P003", "Keyboard Mechanical", 750000, 8),
                new ProdukTugas("P004", "Monitor Gaming 24 inch", 2300000, 3),
                new ProdukTugas("P005", "Headset Gaming RGB", 450000, 10)
        };

        System.out.println("=== DAFTAR SELURUH PRODUK TOKO ===");
        for (int i = 0; i < daftarProduk.length; i++) {
            daftarProduk[i].tampilkanData();
        }

        System.out.println("\n=== SIMULASI PEMBELIAN ===");
        System.out.println("Simulasi 1: Membeli 2 Mouse Wireless");
        int jumlahBeli1 = 2;
        double total1 = daftarProduk[1].hitungTotalHarga(jumlahBeli1);
        System.out.println("Total harga: Rp " + total1);
        daftarProduk[1].kurangiStok(jumlahBeli1);

        System.out.println();
        System.out.println("Simulasi 2: Membeli 5 Monitor (Stok saat ini: " + daftarProduk[3].stok + ")");
        daftarProduk[3].kurangiStok(5);

        System.out.println("\n=== MENCARI PRODUK DENGAN HARGA TERMAHAL ===");
        ProdukTugas produkTermahal = daftarProduk[0];
        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > produkTermahal.harga) {
                produkTermahal = daftarProduk[i];
            }
        }

        System.out.println("Produk dengan harga termahal adalah:");
        produkTermahal.tampilkanData();
    }
}