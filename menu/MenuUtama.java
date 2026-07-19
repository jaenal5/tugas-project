package menu;

import java.util.Scanner;

public class MenuUtama {

    public static void tampilMenu() {

        Scanner input = new Scanner(System.in);
        int pilih;

        do {

            System.out.println("\n=====================================");
            System.out.println("     SISTEM PERPUSTAKAAN CLI");
            System.out.println("=====================================");
            System.out.println("1. Data Buku");
            System.out.println("2. Data Anggota");
            System.out.println("3. Peminjaman Buku");
            System.out.println("4. Pengembalian Buku");
            System.out.println("5. Laporan");
            System.out.println("0. Keluar");
            System.out.println("=====================================");

            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();

            switch (pilih) {

                case 1:
                    MenuBuku.menu();
                    break;

                case 2:
                    System.out.println("Menu Data Anggota");
                    break;

                case 3:
                    System.out.println("Menu Peminjaman");
                    break;

                case 4:
                    System.out.println("Menu Pengembalian");
                    break;

                case 5:
                    System.out.println("Menu Laporan");
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 0);

    }

}