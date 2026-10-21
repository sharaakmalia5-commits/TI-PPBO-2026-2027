public class ArrayPersegi2 {
    public static void main(String[] args) {
        // Membuat array of object Persegi dengan 4 ukuran berbeda
        Persegi[] listPersegi = {
                new Persegi(4.0),
                new Persegi(9.5),
                new Persegi(6.0),
                new Persegi(8.2)
        };

        // Mencari persegi dengan luas terbesar
        Persegi persegiTerbesar = listPersegi[0];
        double luasMax = persegiTerbesar.hitungLuas();

        for (int i = 1; i < listPersegi.length; i++) {
            double luasSekarang = listPersegi[i].hitungLuas();
            if (luasSekarang > luasMax) {
                luasMax = luasSekarang;
                persegiTerbesar = listPersegi[i];
            }
        }

        System.out.println("Persegi dengan Luas Terbesar:");
        System.out.println("Panjang Sisi : " + persegiTerbesar.sisi);
        System.out.println("Luas         : " + luasMax);
        System.out.println("Keliling     : " + persegiTerbesar.hitungKeliling());
    }
}

