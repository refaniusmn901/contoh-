import data.pengguna;
import logic.validator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        pengguna user1 = new pengguna("Alice", "alice123", "password");
        pengguna user2 = new pengguna("Davina", "davina17", "davina217");

        validator val = new validator();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String inputUsername = sc.nextLine();

        System.out.print("Masukkan Password: ");
        String inputPassword = sc.nextLine();

        if (val.validateLogin(user1, inputUsername, inputPassword)) {
            System.out.println("Login berhasil! Selamat datang " + user1.getNama());
        } else if (val.validateLogin(user2, inputUsername, inputPassword)) {
            System.out.println("Login berhasil! Selamat datang " + user2.getNama());
        } else {
            System.out.println("Login gagal! Username atau Password salah.");
        }

        sc.close();
    }
}