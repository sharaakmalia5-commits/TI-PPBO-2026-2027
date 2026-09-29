import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menentukan KKM
        final int KKM = 70;

        System.out.println("PROGRAM PENGOLAH NILAI KELAS");

        // Tugas a : Baca jumlah mahasiswa N dan input nilai ke dalam array
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int n = input.nextInt();

        // Validasi untuk memastikan jumlah mahasiswa valid
        if (n <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            input.close();
            return;
        }

        // Deklarasi array dengan ukuran N
        int[] nilaiUjian = new int[n];

        System.out.println("Masukkan nilai ujian untuk setiap mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiUjian[i] = input.nextInt();
        }

        // Tugas b : Hitung rata-rata, tertinggi, terendah, jumlah lulus dan tidak lulus
        // =================================================================
        int totalNilai = 0;
        int nilaiTertinggi = nilaiUjian[0];
        int nilaiTerendah = nilaiUjian[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            int skor = nilaiUjian[i];
            totalNilai += skor;

            // Mencari nilai tertinggi
            if (skor > nilaiTertinggi) {
                nilaiTertinggi = skor;
            }

            // Mencari nilai terendah
            if (skor < nilaiTerendah) {
                nilaiTerendah = skor;
            }

            // Menghitung status kelulusan berdasarkan KKM
            if (skor >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menghitung rata-rata kelas
        double rataRata = (double) totalNilai / n;

        // Tugas c : Tampilkan array sebelum diurutkan & urutkan dengan Bubble Sort
        System.out.println("\n");
        System.out.print("Array nilai sebelum diurutkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiUjian[i] + (i < n - 1 ? ", " : ""));
        }
        System.out.println();

        //Bubble Sort Ascending
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nilaiUjian[j] > nilaiUjian[j + 1]) {
                    // Proses tukar nilai
                    int temp = nilaiUjian[j];
                    nilaiUjian[j] = nilaiUjian[j + 1];
                    nilaiUjian[j + 1] = temp;
                }
            }
        }

        System.out.print("Array nilai sesudah diurutkan:  ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiUjian[i] + (i < n - 1 ? ", " : ""));
        }
        System.out.println("\n");

        // Tugas d : Tampilkan seluruh hasil dalam format laporan yang rapi
        System.out.println("LAPORAN HASIL UJIAN KELAS");
        System.out.println(" Jumlah Mahasiswa (N)    : " + n);
        System.out.println(" Kriteria Ketuntasan (KKM): " + KKM);
        System.out.println("------------------------------------------");
        System.out.printf(" Nilai Rata-rata Kelas   : %.2f\n", rataRata);
        System.out.println(" Nilai Tertinggi         : " + nilaiTertinggi);
        System.out.println(" Nilai Terendah          : " + nilaiTerendah);
        System.out.println(" Jumlah Mahasiswa Lulus  : " + jumlahLulus);
        System.out.println(" Jumlah Mahasiswa Gagal  : " + jumlahTidakLulus);

        input.close();
    }
}