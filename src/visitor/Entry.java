package visitor;

public abstract class Entry implements Element{

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public String toString(){
        return getName() + " (" + getSize() + ")";
    }
}
