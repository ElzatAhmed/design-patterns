package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{

    private String name;
    private List<Entry> directory;

    public Directory(String name) {
        this.name = name;
        this.directory = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for(Entry entry : directory)
            size += entry.getSize();
        return size;
    }

    @Override
    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for(Entry entry : directory)
            entry.printList(prefix);
    }
}
