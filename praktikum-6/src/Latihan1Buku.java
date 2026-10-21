public class Latihan1Buku {
        String judul;
        String pengarang;
        int tahunTerbit;

        // Construktor berparameter menggunakan 'this'
        public Latihan1Buku(String judul, String pengarang, int tahunTerbit) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.tahunTerbit = tahunTerbit;
        }

        public void tampilkanInfo() {
            System.out.println("Judul       : " + judul);
            System.out.println("Pengarang   : " + pengarang);
            System.out.println("Tahun Terbit: " + tahunTerbit);
            System.out.println("-----------------------------");
        }

        public static void main(String[] args) {
            //Membuat 2 object berbeda
            Latihan1Buku buku1 = new Latihan1Buku("Pemrograman Berorientasi Objek", "Senin bin Khamis",
                    2022);
            Latihan1Buku buku2 = new Latihan1Buku("Hari Lahir Pancasila","Selasa bin Sabtu", 2021);

            //Menampilkan data
            buku1.tampilkanInfo();
            buku2.tampilkanInfo();
        }
}
