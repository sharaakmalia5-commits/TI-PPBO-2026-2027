public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // Constructor untuk menginisialisasi produk
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga); // Menggunakan setter untuk validasi dari awal
        setStokAwal(stok);
    }

    // Getter
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Setter
    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    // Setter harga dengan validasi (tidak boleh negatif)
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Gagal: Harga produk tidak boleh bernilai negatif");
        }
    }

    // Helper untuk inisialisasi stok awal di constructor
    private void setStokAwal(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
            System.out.println("Peringatan: Stok awal negatif, otomatis diset menjadi 0.");
        }
    }

    // Method Manajemen Stok
    // Method tambah stok dengan validasi jumlah positif
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Berhasil menambah stok. Stok sekarang: " + stok);
        } else {
            System.out.println("Gagal: Jumlah penambahan stok harus bernilai positif (> 0)");
        }
    }

    // Method kurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Gagal: Jumlah pengurangan stok harus bernilai positif (> 0)");
        } else if (jumlah > stok) {
            System.out.println("Gagal: Stok tidak mencukupi! Stok saat ini: " + stok);
        } else {
            stok -= jumlah;
            System.out.println("Berhasil mengurangi stok. Stok sekarang: " + stok);
        }
    }
}
