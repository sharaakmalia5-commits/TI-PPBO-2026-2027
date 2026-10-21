public class ArrayBuku {
    public static void main(String[] args) {
        // Membuat array of object berisi minimal 4 buku
        Buku[] daftarBuku = {
                new Buku("Hari Lahir Pancasila", "Bumi Sanjaya", 2014),
                new Buku("Pahlawan Nasional", "Siti Rahayu", 2017),
                new Buku("Sejarah Indonesia", "Maskulin", 2019),
                new Buku("Kebakaran Hutan Kalimantan", "Judika", 2026)
        };

        System.out.println("Daftar Buku yang Terbit Setelah Tahun 2015:");
        System.out.println("-----------------------------------");
        for (Buku b : daftarBuku) {
            if (b.tahunTerbit > 2015) {
                System.out.println("- " + b.judul + " (" + b.tahunTerbit + ")");
            }
        }
    }
}

