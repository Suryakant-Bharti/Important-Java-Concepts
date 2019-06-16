package java_design_patterns.gof_behavioral.iterator;

public class NameRepository implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < names.length)
                return true;

            return false;
        }

        @Override
        public Object nextName() {

            if(this.hasNext())
                return names[index++];

            return null;
        }
    }
}
