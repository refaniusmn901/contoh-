package app;
public class Product {
    String nama;
    float harga;

    public Product(String nama, float harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public void displayinfo() {
        System.out.println("Nama Produk  :" + nama);
        System.out.println("Harga Produk :" + harga);
    }
    
}
