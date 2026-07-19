package service;

import config.Koneksi;
import java.sql.*;
import java.util.Scanner;

public class BukuService {

    Connection conn = Koneksi.getConnection();
    Scanner input = new Scanner(System.in);

    // ==========================
    // TAMBAH BUKU
    // ==========================
    public void tambahBuku() {

        try {

            System.out.println("\n===== TAMBAH BUKU =====");

            System.out.print("Kode Buku      : ");
            String kode = input.nextLine();

            System.out.print("Judul Buku     : ");
            String judul = input.nextLine();

            System.out.print("Pengarang      : ");
            String pengarang = input.nextLine();

            System.out.print("Penerbit       : ");
            String penerbit = input.nextLine();

            System.out.print("Tahun Terbit   : ");
            int tahun = Integer.parseInt(input.nextLine());

            System.out.print("Kategori       : ");
            String kategori = input.nextLine();

            System.out.print("Stok           : ");
            int stok = Integer.parseInt(input.nextLine());

            String sql = "INSERT INTO buku(kode_buku,judul,pengarang,penerbit,tahun_terbit,kategori,stok) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, kode);
            ps.setString(2, judul);
            ps.setString(3, pengarang);
            ps.setString(4, penerbit);
            ps.setInt(5, tahun);
            ps.setString(6, kategori);
            ps.setInt(7, stok);

            ps.executeUpdate();

            System.out.println("\nData berhasil disimpan.");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    // ==========================
    // TAMPILKAN BUKU
    // ==========================
    public void tampilBuku() {

        try {

            String sql = "SELECT * FROM buku";

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n========================================================================================");
            System.out.printf("%-3s %-8s %-25s %-20s %-15s %-6s %-10s %-5s\n",
                    "ID","Kode","Judul","Pengarang","Penerbit","Thn","Kategori","Stok");
            System.out.println("========================================================================================");

            while(rs.next()){

                System.out.printf("%-3d %-8s %-25s %-20s %-15s %-6d %-10s %-5d\n",

                        rs.getInt("id_buku"),
                        rs.getString("kode_buku"),
                        rs.getString("judul"),
                        rs.getString("pengarang"),
                        rs.getString("penerbit"),
                        rs.getInt("tahun_terbit"),
                        rs.getString("kategori"),
                        rs.getInt("stok"));

            }

            System.out.println("========================================================================================");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}