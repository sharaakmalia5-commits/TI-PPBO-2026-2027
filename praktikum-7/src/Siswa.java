public class Siswa {
    private double nilai;

    // Constructor untuk menginisialisasi nilai siswa
    public Siswa(double nilai) {
        setNilai(nilai); // Menggunakan setter untuk validasi dari awal
    }

    // Getter
    public double getNilai() {
        return nilai;
    }

    // Setter dengan validasi rentang 0 - 100
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai tidak valid! Harus di rentang 0 - 100.");
        }
    }

    // Method untuk mengembalikan nilai huruf
    public char getNilaiHuruf() {
        if (nilai >= 85) {
            return 'A';
        } else if (nilai >= 70) {
            return 'B';
        } else if (nilai >= 55) {
            return 'C';
        } else if (nilai >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
