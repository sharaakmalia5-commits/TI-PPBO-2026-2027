import java.util.Scanner;

public class KalkulatorMethod {
    // Tugas a
    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Gagal : Tidak boleh pembagian dengan nol!");
            return 0;
        }
        return a / b;
    }

    public static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    public static double akarKuadrat(double a) {
        if (a < 0) {
            System.out.println("Gagal : Tidak bisa menarik akar dari angka negatif!");
            return 0;
        }
        return Math.sqrt(a);
    }

    // Tugas d
    public static double riwayatKeMaksimum(double[] riwayatHasil, int jumlahOperasi) {
        if (jumlahOperasi == 0) return 0;
        double max = riwayatHasil[0];
        for (int i = 1; i < jumlahOperasi; i++) {
            if (riwayatHasil[i] > max) {
                max = riwayatHasil[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] riwayatHasil = new double[100];
        int jumlahOperasi = 0;
        int pilihan;

        // Tugas b
        do {
            System.out.println("KALKULATOR");
            System.out.println("1. Penjumlahan (2 Angka)");
            System.out.println("2. Penjumlahan (3 Angka) [Overload]");
            System.out.println("3. Pengurangan");
            System.out.println("4. Perkalian");
            System.out.println("5. Pembagian");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar & Lihat Riwayat Maksimum");
            System.out.print("Pilih menu (1-8): ");
            pilihan = input.nextInt();

            double hasil = 0;
            boolean validOp = true;

            // Tugas b
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double a1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b1 = input.nextDouble();
                    hasil = tambah(a1, b1);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double a2 = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b2 = input.nextDouble();
                    System.out.print("Masukkan angka ketiga: ");
                    double c2 = input.nextDouble();
                    hasil = tambah(a2, b2, c2);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama (angka yang dikurangi): ");
                    double a3 = input.nextDouble();
                    System.out.print("Masukkan angka kedua (angka pengurang): ");
                    double b3 = input.nextDouble();
                    hasil = kurang(a3, b3);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    double a4 = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b4 = input.nextDouble();
                    hasil = kali(a4, b4);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 5:
                    System.out.print("Masukkan angka yang akan dibagi: ");
                    double a5 = input.nextDouble();
                    System.out.print("Masukkan pembagi: ");
                    double b5 = input.nextDouble();
                    if (b5 == 0) {
                        validOp = false;
                    } else {
                        hasil = bagi(a5, b5);
                        System.out.println("Hasil: " + hasil);
                    }
                    break;

                case 6:
                    System.out.print("Masukkan angka basis: ");
                    double a6 = input.nextDouble();
                    System.out.print("Masukkan angka pangkat: ");
                    double b6 = input.nextDouble();
                    hasil = pangkat(a6, b6);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 7:
                    System.out.print("Masukkan angka untuk akar kuadrat: ");
                    double a7 = input.nextDouble();
                    if (a7 < 0) {
                        validOp = false;
                    } else {
                        hasil = akarKuadrat(a7);
                        System.out.println("Hasil: " + hasil);
                    }
                    break;

                case 8:
                    System.out.println("\nKeluar dari program..");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih antara 1 - 8.");
                    validOp = false;
            }

            if (pilihan >= 1 && pilihan <= 7 && validOp) {
                if (jumlahOperasi < riwayatHasil.length) {
                    riwayatHasil[jumlahOperasi] = hasil;
                    jumlahOperasi++;
                }
            }

        } while (pilihan != 8);

        // Tugas d
        System.out.println("\nRingkasan Riwayat");
        if (jumlahOperasi > 0) {
            double maxRiwayat = riwayatKeMaksimum(riwayatHasil, jumlahOperasi);
            System.out.println("Total perhitungan yang dilakukan: " + jumlahOperasi);
            System.out.println("Hasil riwayat perhitungan terbesar: " + maxRiwayat);
        } else {
            System.out.println("Tidak ada riwayat perhitungan yang tersimpan.");
        }
        System.out.println("Terima kasih, sampai jumpa!");

        input.close();
    }
}

