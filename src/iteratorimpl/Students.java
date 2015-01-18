package iteratorimpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by misko on 18.1.2015.
 */
public class Students implements Container {

    private List<String> students = new ArrayList<String>();

    public Students() {
        students.add("Michael");
        students.add("Peter");
        students.add("John");
        students.add("Mike");
        students.add("Lukas");
    }

    @Override
    public Iterator getIterator() {
        return new StudentsIterator();
    }

    private class StudentsIterator implements Iterator {

        private int position;

        @Override
        public boolean hasNext() {
            if (position < students.size())
                return true;
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return students.get(position++);
            return null;
        }
    }
}
