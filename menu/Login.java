package menu;

import config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Login {

    public static boolean login() {

        Scanner input = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      LOGIN PERPUSTAKAAN");
        System.out.println("==================================");

        System.out.print("Username : ");
        String username = input.nextLine();

        System.out.print("Password : ");
        String password = input.nextLine();

        try {

            Connection conn = Koneksi.getConnection();

            String sql = "SELECT * FROM user WHERE username=? AND password=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("\nLogin Berhasil!\n");
                return true;
            } else {
                System.out.println("\nUsername atau Password Salah!\n");
                return false;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

}