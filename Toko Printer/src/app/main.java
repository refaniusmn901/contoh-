package app;
public class main {
    public static void main(String[] args) {
        inkjetPrinter inkjet = new inkjetPrinter("Canon InkJet", 2000000, "Canon", "Inkjet", 6);
        LaserPrinter laser = new LaserPrinter("HP LaserJet", 2500000, "HP", "Laser", 25);

        System.out.println("INKJET PRINTER");
        inkjet.displayinfo();
        inkjet.displayPrinterDetails();
        inkjet.setDocuments("soal uts");
        inkjet.printDocuments();

        System.out.println("LASER PRINTER");
        laser.displayinfo();
        laser.displayPrinterDetails();
        laser.setDocuments( "soal uas", "pdf");
        laser.printDocuments();

        
    }
}