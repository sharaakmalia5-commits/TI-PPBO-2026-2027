import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Latihan Nomor 1
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = scanner.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap\n\n");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil\n\n");
        }
        // Latihan nomor 2
        System.out.print("Masukkan bilangan pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = scanner.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int c = scanner.nextInt();

        int terbesar;
        if (a >= b) {
            if (a >= c) {
                terbesar = a;
            } else {
                terbesar = c;
            }
            } else {
            if (b >= c) {
                terbesar = b;
            } else {
                terbesar = c;
            }
        }

        System.out.println("Bilangan terbesar di antara ketiganya adalah: " + terbesar);


        // Latihan Nomor 3
        System.out.println("\n\nMenu makanan");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Soto daging");
        System.out.println("4. Bakso Urat");
        System.out.print("Masukkan pilihan Anda (1-4): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu pilih: Nasi Goreng");
                break;
            case 2:
                System.out.println("Kamu pilih: Mie Ayam");
                break;
            case 3:
                System.out.println("Kamu pilih: Soto Daging");
                break;
            case 4:
                System.out.println("Kamu pilih: Bakso Urat");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        // Latihan Nomor 4
        System.out.print("\n\nMasukkan umur: ");
        int umur = scanner.nextInt();

        System.out.print("\nApakah Anda mahasiswa? (True/False): ");
        boolean isMahasiswa = scanner.nextBoolean();

        int hargaTiket;
        if (isMahasiswa && umur < 25) {
            hargaTiket = 25000;
            System.out.println("Kategori: Promo Khusus Mahasiswa (< 25 Tahun)");
        } else if (umur < 15) {
            hargaTiket = 30000;
            System.out.println("Kategori: Tarif Remaja");
        } else if (umur >= 40) {
            hargaTiket = 25000;
            System.out.println("Kategori: Tarif Dewasa");
        } else {
            hargaTiket = 50000;
            System.out.println("Kategori: Tarif Reguler");
        }
        System.out.println("Total harga tiket Anda: Rp " + hargaTiket);


        // Latihan Nomor 5
        System.out.print("\n\nMasukkan berat badan (kg): ");
        double berat = scanner.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = scanner.nextDouble();

        double tinggiM = tinggiCm / 100.0;

        double bmi = berat / (tinggiM * tinggiM);

        System.out.printf("Nilai BMI Anda: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else {
            if (bmi <= 24.9) {
                System.out.println("Kategori: Normal");
            } else {
                if (bmi <= 29.9) {
                    System.out.println("Kategori: Gemuk");
                } else {
                    System.out.println("Kategori: Obesitas");
                }
            }
        }

        scanner.close();
    }
}




