public class ProdukTugas {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // 2. Constructor dengan parameter menggunakan 'this'
    public ProdukTugas(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // 3. Instance method hitungTotalHarga (tanda '*' sudah ditambahkan)
    public double hitungTotalHarga(int jumlahBeli) {
        return this.harga * jumlahBeli;
    }

    // 4. Instance method kurangiStok
    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
            System.out.println("Pembelian sukses! Sisa stok " + this.namaProduk + ": " + this.stok);
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    // 5. Instance method tampilkanData
    public void tampilkanData() {
        System.out.println("Kode Produk  : " + kodeProduk);
        System.out.println("Nama Produk  : " + namaProduk);
        System.out.println("Harga        : Rp " + harga);
        System.out.println("Stok         : " + stok);
        System.out.println("----------------------------------------");
    }
}