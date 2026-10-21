class ProdukLatihan {
    String namaProduk;
    double harga;

    // Constructor
    public ProdukLatihan(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method untuk mengecek apakah harga melebihi batasHarga
    public boolean isMahal(double batasHarga) {
        return this.harga > batasHarga;
    }
}

public class Latihan3Produk {
    public static void main(String[] args) {
        ProdukLatihan produk1 = new ProdukLatihan("Laptop ASUS ROG", 15000000);
        double batas = 5000000;

        System.out.println("Produk: " + produk1.namaProduk);
        System.out.println("Harga : Rp " + produk1.harga);
        System.out.println("Apakah melebihi batas Rp " + batas + "? " + produk1.isMahal(batas));
    }
}