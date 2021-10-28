package proxy;

public class Printer implements Printable{

    private String name;

    public Printer(String name){
        System.out.println("instantiating a printer...");
        this.name = name;
    }

    @Override
    public void print(String s) {
        System.out.println("==========" + name + "============");
        System.out.println(s);
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }
}
