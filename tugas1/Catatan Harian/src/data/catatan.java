package data;

public class catatan {
private String tanggal;
private String isi; 
public catatan(String tanggal, String isi) {
    this.tanggal = tanggal;
    this.isi = isi;
}

public String getTanggal() {
    return tanggal;
}

public String getIsi() {
    return isi;
}

public void setTanggal(String tanggal) {
    this.tanggal = tanggal;
}

public void setIsi(String isi) {
    this.isi = isi;
}
}
