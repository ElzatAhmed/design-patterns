package visitor;

public class Main {

    public static void main(String[] args) {
        Directory d1 = new Directory("d1");
        d1.add(new File("f1", 100));
        Directory d2 = new Directory("d2");
        d1.add(d2);
        d2.add(new File("f2", 50));
        Visitor v = new ListVisitor("dir");
        v.visit(d1);
    }

}
