package logic;

import data.pengguna;
import data.catatan;

public class validator {
    public boolean validatePengguna(pengguna user) {
        if (user.getNama() == null || user.getNama().isEmpty()) {
            return false;
        }
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            return false;
        }
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validateLogin(pengguna user, String inputUsername, String inputPassword) {
        if (user.getUsername() == null || user.getPassword() == null) {
            return false;
        }
        return user.getUsername().equals(inputUsername) && user.getPassword().equals(inputPassword);
    }

    public boolean validateCatatan(catatan note) {
        if (note.getTanggal() == null || note.getTanggal().isEmpty()) {
            return false;
        }
        if (note.getIsi() == null || note.getIsi().isEmpty()) {
            return false;
        }
        return true;
    }

}
