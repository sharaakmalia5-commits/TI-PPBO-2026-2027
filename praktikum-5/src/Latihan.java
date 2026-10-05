import java.util.Scanner;
import java.util.Arrays;

public class Latihan {
    // LATIHAN 1: Method Luas Persegi Panjang dan Lingkaran
    public static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    public static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    // LATIHAN 2: Method Cek Bilangan Prima
    public static boolean isPrima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // LATIHAN 3: Method Overloading Konversi Suhu
    public static double konversiSuhu(double celsius) {
        // Konversi default ke Fahrenheit
        return (celsius * 9 / 5) + 32;
    }

    public static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        }
        return celsius; // Jika skala tidak dikenal
    }

    // LATIHAN 4: Method Cari Minimum & Maksimum Array
    public static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    // LATIHAN 5: Method Hitung Total dan Filter Di Atas Rata-Rata
    public static int hitungTotal(int[] data) {
        int total = 0;
        for (int val : data) {
            total += val;
        }
        return total;
    }

    public static int[] filterDiAtasRataRata(int[] data) {
        if (data.length == 0) return new int[0];

        double rataRata = (double) hitungTotal(data) / data.length;

        // menghitung berapa banyak elemen di atas rata-rata
        int count = 0;
        for (int val : data) {
            if (val > rataRata) {
                count++;
            }
        }

        // membuat array baru
        int[] hasil = new int[count];
        int index = 0;
        for (int val : data) {
            if (val > rataRata) {
                hasil[index++] = val;
            }
        }
        return hasil;
    }

    // Method Main untuk latihan 1-5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Latihan 1
        System.out.println("LATIHAN 1");
        System.out.println("Luas Persegi Panjang (panjang=5, lebar=3): " + luasPersegiPanjang(5, 3));
        System.out.println("Luas Lingkaran (jari-jari=7): " + luasLingkaran(7));
        System.out.println();

        //Latihan 2
        System.out.println("LATIHAN 2");
        System.out.print("Bilangan prima dari 1 sampai 50: ");
        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        //Latihan 3
        System.out.println("LATIHAN 3");
        double c = 25.0;
        System.out.println(c + " °C ke Fahrenheit: " + konversiSuhu(c) + " °F");
        System.out.println(c + " °C ke Kelvin: " + konversiSuhu(c, "Kelvin") + " K");
        System.out.println(c + " °C ke Fahrenheit (overload): " + konversiSuhu(c, "Fahrenheit") + " °F");
        System.out.println();

        //Latihan 4 dan 5
        System.out.println("LATIHAN 4 dan 5");
        System.out.print("Masukkan jumlah data nilai ujian: ");
        int n = input.nextInt();

        if (n > 0) {
            int[] nilaiUjian = new int[n];
            System.out.println("Masukkan " + n + " nilai ujian:");
            for (int i = 0; i < n; i++) {
                System.out.print("Data ke-" + (i + 1) + ": ");
                nilaiUjian[i] = input.nextInt();
            }

            //Latihan 4
            System.out.println("\nHasil Latihan 4");
            System.out.println("Nilai Minimum : " + cariNilaiMinimum(nilaiUjian));
            System.out.println("Nilai Maksimum: " + cariNilaiMaksimum(nilaiUjian));

            //Latihan 5
            System.out.println("\nHasil Latihan 5");
            int total = hitungTotal(nilaiUjian);
            double rataRata = (double) total / n;
            System.out.println("Total Jumlah Nilai: " + total);
            System.out.printf("Rata-rata Kelas    : %.2f\n", rataRata);

            int[] diatasRata = filterDiAtasRataRata(nilaiUjian);
            System.out.println("Nilai di atas rata-rata: " + Arrays.toString(diatasRata));
        } else {
            System.out.println("Jumlah data tidak valid.");
        }

        input.close();
    }
}

