import java.util.Scanner;

public class BiodataSaya {
    public static void main(String[] args) {
        // Program menampilkan biodata sederhana
        // Latihan Nomor 1
        System.out.println("Nama: Shara Akmalia");
        System.out.println("NIM : 2025573030107");
        System.out.println("Prodi : Teknik Informatika");

        // Program menampilkan biodata sederhana
        // Latihan Nomor 2
        System.out.print("\n\nNama: Shara Akmalia-");
        System.out.print("NIM : 2025573030107-");
        System.out.print("Prodi : Teknik Informatika"); // Jurusan Teknologi Informasi dan Komputer

        // Latihan nomor 3
        String nama = "\n\nShara Akmalia";
        int umur = 19;
        double tinggi = 144;
        char golDarah = '-';
        boolean mahasiswaAktif = true;

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Golongan Darah: " + golDarah);
        System.out.println("Aktif: " + mahasiswaAktif);

        // Latihan Nomor 4

        System.out.println("\n\nLatihan Nomor 4\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam derajat Celsius : ");
        double celsius = input.nextDouble();

        // rumus konversi
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Hasil konversi : " + fahrenheit + " °F");

        //Latihan Nomor 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat pertama = ");
        int a = scanner.nextInt();

        System.out.print("Masukkan bilangan bulat kedua = ");
        int b = scanner.nextInt();

        System.out.println("\n--- Hasil Aritmatika ---");
        System.out.println("Penjumlahan (" + a + " + " + b + ") = " + (a + b));
        System.out.println("\n--- Hasil Aritmatika ---");
        System.out.println("Pengurangan (" + a + " - " + b + ") = " + (a - b));
        System.out.println("\n--- Hasil Aritmatika ---");
        System.out.println("Perkalian (" + a + " * " + b + ") = " + (a * b));
        System.out.println("\n--- Hasil Aritmatika ---");
        System.out.println("Pembagian (" + a + " / " + b + ") = " + ((double) a / b));
        System.out.println("Sisa Bagi (" + a + " % " + b + ") = " + (a % b));
        System.out.println("\n--- Hasil Perbandingan (Boolean) ---");
        System.out.println(a + ">" + b + "=" + (a > b));
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " == " + b + " = " + (a == b));

        scanner.close();
    }
}