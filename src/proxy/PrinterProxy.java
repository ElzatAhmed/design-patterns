package proxy;

public class PrinterProxy implements Printable{

    private String name;
    private Printer printer;

    @Override
    public void print(String s) {
        realize();
        printer.print(s);
    }

    @Override
    public void setPrinterName(String name) {
        if(printer != null)
            printer.setPrinterName(name);
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    private synchronized void realize(){
        if(printer == null)
            printer = new Printer(name);
    }
}
