import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // latihan nomor 1
        System.out.println("Latihan nomor 1");
        System.out.print("Masukkan bilangan: ");
        int n1 = input.nextInt();

        System.out.println("Tabel perkalian 1 sampai 10 untuk " + n1 + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + (n1 * i));
        }
        System.out.println();

        // latihan nomor 2
        System.out.println("Latihan Nomor 2");
        System.out.print("Masukkan ukuran/tinggi pola: ");
        int n2 = input.nextInt();

        // Pola Segitiga Terbalik
        System.out.println("\nPola Segitiga Terbalik:");
        for (int i = n2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pola Persegi
        System.out.println("\nPola Persegi:");
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // latihan nomor 3
        System.out.println("Latihan Nomor 3");
        int[] arr3 = new int[10];

        System.out.println("Masukkan 10 bilangan:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr3[i] = input.nextInt();
        }

        System.out.println("\nArray dalam urutan terbalik:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("\n");

        // Latihan Nomor 4
        System.out.println("Latihan Nomor 4");
        int[][] matriks = new int[3][3];
        int totalSum = 0;

        System.out.println("Masukkan elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.println("\nHasil Perhitungan:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matriks[i][j];
                totalSum += matriks[i][j];
            }
            System.out.println("Jumlah baris " + (i + 1) + " = " + rowSum);
        }
        System.out.println("Jumlah seluruh elemen matriks = " + totalSum + "\n");

        // latihan nomor 5
        System.out.println("Latihan Nomor 5");
        System.out.print("Masukkan jumlah elemen array: ");
        int n5 = input.nextInt();

        if (n5 < 2) {
            System.out.println("Array harus memiliki minimal 2 elemen.\n");
        } else {
            int[] arr5 = new int[n5];
            System.out.println("Masukkan elemen array:");
            for (int i = 0; i < n5; i++) {
                System.out.print("Elemen ke-" + (i + 1) + ": ");
                arr5[i] = input.nextInt();
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < n5; i++) {
                if (arr5[i] > largest) {
                    secondLargest = largest;
                    largest = arr5[i];
                } else if (arr5[i] > secondLargest && arr5[i] != largest) {
                    secondLargest = arr5[i];
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("Tidak ada nilai terbesar kedua (semua elemen bernilai sama).\n");
            } else {
                System.out.println("Nilai terbesar kedua adalah: " + secondLargest + "\n");
            }
        }

        // latihan nomor 6
        System.out.println("Latihan Nomor 6");
        System.out.print("Masukkan jumlah elemen array: ");
        int n6 = input.nextInt();
        int[] arr6 = new int[n6];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n6; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr6[i] = input.nextInt();
        }

        //sebelum diurutkan
        System.out.print("\nArray sebelum diurutkan: ");
        for (int i = 0; i < n6; i++) {
            System.out.print(arr6[i] + " ");
        }

        //Bubble Sort Ascending
        for (int i = 0; i < n6 - 1; i++) {
            for (int j = 0; j < n6 - i - 1; j++) {
                if (arr6[j] > arr6[j + 1]) {
                    int temp = arr6[j];
                    arr6[j] = arr6[j + 1];
                    arr6[j + 1] = temp;
                }
            }
        }

        //sesudah diurutkan
        System.out.print("\nArray sesudah diurutkan: ");
        for (int i = 0; i < n6; i++) {
            System.out.print(arr6[i] + " ");
        }
        System.out.println();

        input.close();
    }
}