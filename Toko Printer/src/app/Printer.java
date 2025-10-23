package app;
public class Printer extends Product{
    String merk;
    String tipe;
    String namadoc;
    
    public Printer(String nama, float harga, String merk, String tipe) {
        super(nama, harga);
        this.merk = merk;
        this.tipe = tipe;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Merk :" + merk);
        System.out.println("Tipe :" + tipe);
    }

    public void displayPrinterDetails() {
        System.out.println("Detail printer:" + merk + tipe);
    }

    public void setDocuments(String namadoc) {
        this.namadoc = namadoc;
        System.out.println("File " + namadoc + " disiapkan");
    }

    public void setDocuments(String namadoc, String jenisdoc) {
        this.namadoc = namadoc;
        System.out.println("File " + namadoc + " dengan jenis file: " + jenisdoc + " disiapkan");
    }

    public void printDocuments() {
        System.out.println("Print " + namadoc + " dengan printer");
    }

}
