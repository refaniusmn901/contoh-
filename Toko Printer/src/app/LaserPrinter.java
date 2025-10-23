package app;

public class LaserPrinter extends Printer {
    int kecepatanCetak;

    public LaserPrinter(String nama, float harga, String merk, String tipe, int kecepatanCetak){
    super(nama, harga, merk, tipe);
    this.kecepatanCetak = kecepatanCetak;
    }

    @Override
    public void displayPrinterDetails() {
    System.out.println("Kecepatan Cetak:" + kecepatanCetak);   
    }

     public void showLaserDetails() {
        System.out.println("Kecepatan cetak printer " + kecepatanCetak);
    }

    @Override
    public void printDocuments() {
        System.out.println("akan di cetak dengan kecepatan " + kecepatanCetak);
    }
}
