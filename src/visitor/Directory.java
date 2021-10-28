package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry{

    private String name;
    private List<Entry> directory;

    public Directory(String name) {
        this.name = name;
        this.directory = new ArrayList<>();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }

    @Override
    public int getSize() {
        int size = 0;
        for(Entry entry : directory)
            size += entry.getSize();
        return size;
    }

    public Iterator<Entry> iterator(){
        return directory.iterator();
    }
}
