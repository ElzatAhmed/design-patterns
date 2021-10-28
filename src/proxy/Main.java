package proxy;

public class Main {

    public static void main(String[] args) {
        PrinterProxy proxy = new PrinterProxy();
        proxy.setPrinterName("myPrinter");
        proxy.print("Elzat");
    }

}
