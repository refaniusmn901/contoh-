package app;

public class inkjetPrinter extends Printer{
    int jumlahWarna;

    public inkjetPrinter(String nama, float harga, String merk, String tipe, int jumlahWarna){
        super(nama, harga, merk, tipe);
        this.jumlahWarna = jumlahWarna;
    }

    @Override
    public void displayPrinterDetails(){
        System.out.println("Jumlah Warna:" + jumlahWarna);
    }
    
    public void showInkDetails() {
        System.out.println("Printer ini memiliki " + jumlahWarna + "warna tinta");
    }

    @Override
    public void printDocuments(){
        System.out.println("akan dicetak dengan " + jumlahWarna + " warna tinta");
    }
}
