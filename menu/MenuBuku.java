package menu;

import java.util.Scanner;
import service.BukuService;

public class MenuBuku {

    static Scanner input = new Scanner(System.in);

    static BukuService buku = new BukuService();

    public static void menu() {

        int pilih;

        do {

            System.out.println("\n==============================");
            System.out.println("        DATA BUKU");
            System.out.println("==============================");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Edit Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("0. Kembali");
            System.out.println("==============================");

            System.out.print("Pilih Menu : ");

            pilih = Integer.parseInt(input.nextLine());

            switch (pilih) {

                case 1:
                    buku.tambahBuku();
                    break;

                case 2:
                    buku.tampilBuku();
                    break;

                case 3:
                    System.out.println("Menu Edit Buku");
                    break;

                case 4:
                    System.out.println("Menu Hapus Buku");
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Menu Tidak Ada");

            }

        } while (pilih != 0);

    }

}